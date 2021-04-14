package com.craw.until;

import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class HttpClientHelper {

    private static Logger logger = LogManager.getLogger(HttpClientHelper.class);
    static CloseableHttpClient httpClient = null;

    public static void createHttpClient(){
        //when login success save the cookie
        CookieStore cookieStore = new BasicCookieStore();
        //create httpclient
         httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();

    }

    public static void postDataWithJson(){

    }

    public static void getDataWithJson(){

    }

    public static String getDataResponseHtml(String url) {

        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse httpResponse = null;
        String responseHtml = null;
        httpGet.addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36");
        try {
            httpResponse = httpClient.execute(httpGet);
            responseHtml = EntityUtils.toString(httpResponse.getEntity());
            EntityUtils.consume(httpResponse.getEntity());
        } catch (IOException e) {
            logger.error("http request error : " + e.getMessage());
        }finally {
            if(httpResponse!=null){
                try {
                    httpResponse.close();
                } catch (IOException e) {
                    logger.error("URL " +url + " error response close failed : " + e.getMessage());
                }
            }
        }

        return responseHtml;
    }

}
