package com.nsv.jsmbaba.threads.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUsingExecutorService {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable runnableWorker = new WorkerThread(String.valueOf(i));
            executorService.execute(runnableWorker);
        }

        executorService.shutdown();

        while(!executorService.isTerminated()){}

        System.out.println("Finished All Threads");

    }
}
