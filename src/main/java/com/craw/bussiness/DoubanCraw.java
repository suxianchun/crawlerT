package com.craw.bussiness;

import com.craw.bean.DoubanList;
import com.craw.dao.DoubanListMapper;
import com.craw.until.DoubanParseHtml;
import com.craw.until.HttpClientHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("doubanCraw")
public class DoubanCraw {

    @Autowired
    private DoubanParseHtml doubanParseHtml;

    public void execute(String url)
    {
        HttpClientHelper.createHttpClient();

        String html = HttpClientHelper.getDataResponseHtml(url);
        List<DoubanList> list = new ArrayList<DoubanList>();

        int number = doubanParseHtml.maxPage(html);

        for(int i = 0 ;i<number;i++) {

            if(i==0){
                String page = url + "?start="+(i+1)+"&type=T";
                doubanParseHtml.parseDouBanList(html);
            }else
            {
                String page = url +"?start="+(i*20)+"&type=T";
                doubanParseHtml.parseDouBanList(html);
            }

        }


    }
}
