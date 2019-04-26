package com.nsv.jsmbaba.threads.synchronization;

import java.util.concurrent.TimeUnit;

public class AccountRunnable implements Runnable{
    private Account account;

    public AccountRunnable(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.incrementby10();
    }
}
