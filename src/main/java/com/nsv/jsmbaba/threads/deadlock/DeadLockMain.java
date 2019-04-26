package com.nsv.jsmbaba.threads.deadlock;

public class DeadLockMain {

    public static void main(String[] args) throws InterruptedException {
        final String resource1 = "Naga";
        final String resource2 = "Raja";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("Locked Resource1-1");

                    synchronized (resource2){
                        System.out.println("Locked Resource1-2");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("Locked Resource2-2");

                    synchronized (resource1){
                        System.out.println("Locked Resource2-1");
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("End of Thread Execution");


    }
}
