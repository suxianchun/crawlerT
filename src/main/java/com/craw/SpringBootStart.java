package com.craw;

import com.craw.bussiness.DoubanCraw;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@MapperScan("com.craw.dao")
public class SpringBootStart {

    public static void main(String args[]){

        ConfigurableApplicationContext gex = SpringApplication.run(SpringBootStart.class);
        DoubanCraw dc = gex.getBean("doubanCraw",DoubanCraw.class);
        dc.execute("https://book.douban.com/tag/%E7%BC%96%E7%A8%8B");

    }
}
