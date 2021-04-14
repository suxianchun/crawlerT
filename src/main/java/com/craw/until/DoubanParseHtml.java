package com.craw.until;

import com.craw.bean.DoubanList;
import com.craw.dao.DoubanListMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("doubanParseHtml")
public class DoubanParseHtml {


    private static Logger logger = LogManager.getLogger(DoubanParseHtml.class);
    @Autowired
    private DoubanListMapper doubanListMapper;

    public int maxPage(String html){
        Document dou = Jsoup.parse(html);
        Element element = dou.select("#subject_list").get(0);
        String tes = element.select(".paginator").get(0).select("a").get(9).text();

        return Integer.valueOf(tes);
    }

    @Async
    public void parseDouBanList(String html)
    {
        Document document = Jsoup.parse(html);
        Elements elements = document.select("#subject_list > ul > li ");
        if(elements == null && elements.size()==0){

            logger.info("page size : " + html + " ,not found data ");
            return ;
        }
        DoubanList doubanDetail = null;
        for(Element element : elements){
            doubanDetail = new DoubanList();
            Elements tempEl = element.children();
            Elements tempChilrder = null;
            if(check2Elements(tempEl)) {
                tempChilrder = tempEl.get(0).select("a");
                if (check1Element(tempChilrder)) {
                    doubanDetail.setDetailhref(tempChilrder.get(0).attr("href"));
                    tempChilrder = tempChilrder.select("img");
                    if (check1Element(tempChilrder)) {
                        doubanDetail.setImageurl(tempChilrder.get(0).attr("src"));
                    } else {
                        logger.error("get douban list parse html error : #subject_list > ul > li not found <img> tab ");
                        return ;
                    }
                } else {
                    logger.error("get douban list parse html error : #subject_list > ul > li not found <a> tab ");
                    return ;
                }

                Element chirldrenEl = tempEl.get(1);
                tempChilrder = chirldrenEl.select("h2 > a");
                //tempChilrder.toString()
                if(check1Element(tempChilrder)){
                    doubanDetail.setTitle(tempChilrder.get(0).text().trim());
                    tempChilrder = tempChilrder.select("span");
                    if(check1Element(tempChilrder)){
                        doubanDetail.setTitle(doubanDetail.getTitle().trim() + tempChilrder.get(0).text().trim());
                    }else{
                        doubanDetail.setTitle(doubanDetail.getTitle().trim());
                        //logger.error("get douban list parse html error : #subject_list > ul > li not found h2 > a > span tab ");
                        //return false;
                    }
                }else{
                    logger.error("get douban list parse html error : #subject_list > ul > li not found h2 > a tab ");
                    return ;
                }

                tempChilrder = chirldrenEl.select(".pub");
                if(check1Element(tempChilrder)) {
                    doubanDetail.setPress(tempChilrder.get(0).text().trim());
                }else{
                    logger.error("get douban list parse html error : #subject_list > ul > li not found .pub tab ");
                    return ;
                }
                tempChilrder = chirldrenEl.select(".star");
                if(check1Element(tempChilrder)) {
                    tempChilrder.get(0).select(".rating_nums");
                    if(check1Element(tempChilrder.get(0).select(".rating_nums"))){
                        doubanDetail.setRateNum(tempChilrder.get(0).select(".rating_nums").get(0).text().trim());
                    }else
                    {
                        logger.error("get douban list parse html error : #subject_list > ul > li not found h2 > a > .star .rating_num tab ");
                        return ;
                    }
                    tempChilrder = tempChilrder.get(0).select(".pl");
                    if(check1Element(tempChilrder)){
                        doubanDetail.setNumComments(tempChilrder.get(0).text().trim());
                    }else
                    {
                        logger.error("get douban list parse html error : #subject_list > ul > li not found h2 > a > .star .pl tab ");
                        return ;
                    }

                }else{
                    logger.error("get douban list parse html error : #subject_list > ul > li not found .pub tab ");
                    return ;
                }
                tempChilrder = chirldrenEl.select("p");
                if(check1Element(tempChilrder)){
                    doubanDetail.setSimpleabstract(tempChilrder.get(0).text().trim());
                }else
                {
                    logger.error("get douban list parse html error : #subject_list > ul > li not found h2 > a > p tab ");
                    return ;
                }
            }else{
                logger.error("get douban list parse html error : #subject_list > ul > li not found <div> tab ");
                return ;
            }
            doubanListMapper.insert(doubanDetail);

        }

        return ;

    }

    private void detailPage(){

    }

    private  boolean check1Element(Elements elements)
    {
        if(elements != null && elements.size() == 1) {
            return true;
        }
        else{
            return false;
        }
    }

    private  boolean check2Elements(Elements elements){

        if(elements != null && elements.size() == 2) {
            return true;
        }
        else{
            return false;
        }
    }

    private  boolean checkElements(Elements elements)
    {
        if(elements != null && elements.size() > 0) {
            return true;
        }
        else{
            return false;
        }
    }

}
