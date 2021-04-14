package com.craw.test;

public class Liftoff implements Runnable{

    protected int countDown = 10;
    private static int taskId = 0;
    private final int id = taskId++;

    public Liftoff(){}

    public Liftoff(int countDown){
        this.countDown = countDown;
    }

    public String status()
    {
        return id + " : " + (this.countDown > 0 ? countDown : "countDown off");
    }
    @Override
    public void run() {
        while(countDown-- > 0 )
        {
            System.out.println(status());
            Thread.yield();
        }
    }
}
