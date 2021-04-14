package com.craw;

import com.craw.bean.DoubanDetail;
import com.craw.until.DoubanParseHtml;
import com.craw.until.HttpClientHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestClas {

    static Logger logger = LogManager.getLogger(TestClas.class);

    public static void main(String args[]) throws IOException {



        HttpClientHelper.createHttpClient();
        String responseHtml = "";
        String temp = "";
       // String responseHtml = HttpClientHelper.getDataResponseHtml("https://book.douban.com/tag/%E7%BC%96%E7%A8%8B");
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\x.su\\Desktop\\aaa.txt"));
        while((temp = br.readLine())!=null)
        {
            responseHtml = responseHtml+temp;
        }
        logger.info(responseHtml);
        if(responseHtml!=null){
            List<DoubanDetail> doubanDetailList = new ArrayList<DoubanDetail>();
            //DoubanParseHtml.parseDouBanList(responseHtml,doubanDetailList);

        }

    }
}
