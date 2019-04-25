package com.nsv.jsmbaba.threads;

public class ThreadGroupMain {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("nsv");

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(threadGroup,new ImpRunnable());
            t.start();
        }
    }
}
