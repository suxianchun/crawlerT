package com.craw.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLiftOff {

    public static void main(String args[]){
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i =0;i<5;i++){
            es.execute(new Liftoff());

        }
        es.shutdown();

    }
}
