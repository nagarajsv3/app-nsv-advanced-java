package com.nsv.jsmbaba.threads;

public class ImpRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" -Thread is running - created by Class Implemented Runnable Interface + Overrided run method");
    }
}
