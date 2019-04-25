package com.nsv.jsmbaba.threads;

import java.util.concurrent.TimeUnit;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();//creates a separate call stack
        //t1.run();//does not create a separate call stack

        ExtThread mythread = new ExtThread();

        mythread.setPriority(Thread.MAX_PRIORITY);
        mythread.start();
        mythread.join();

        System.out.println("------------");

        ImpRunnable runnable = new ImpRunnable();
        Thread trun = new Thread(runnable,"Nagas-Thread");
        trun.setPriority(5);

        trun.start();
        trun.join();

        Thread.sleep(5000);

        System.out.println("------------");

        TimeUnit.SECONDS.sleep(3);

        System.out.println(Thread.currentThread().getName()+" -Main Thread is running");


    }
}
