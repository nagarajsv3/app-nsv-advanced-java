package com.nsv.jsmbaba.threads.threadpool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.TimeUnit;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class WorkerThread implements Runnable {
private String message;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start message="+message);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" End message="+message);
    }
}
