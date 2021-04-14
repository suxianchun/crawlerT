package com.craw.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallAbleTest {

    public static void main(String args[]){
        List<Future<String>> list = new ArrayList<Future<String>>();


        ExecutorService es = Executors.newCachedThreadPool();
        for(int i= 0;i<10;i++)
            list.add(es.submit(new CallAbleI(i)));
        for(Future<String> f : list){

            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }
}

class CallAbleI implements Callable<String>{

    private int taskid;
    public CallAbleI(int taskid){
        this.taskid = taskid;
    }
    @Override
    public String call() throws Exception {


        return "call method : " + taskid;
    }
}
