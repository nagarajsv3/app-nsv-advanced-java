package com.nsv.jsmbaba.threads;

public class ExtThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" -Thread is running - created by Class Extends Thread Class + Overrided run method");
    }
}
