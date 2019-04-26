package com.nsv.jsmbaba.threads.synchronization;

public class ATM implements Runnable {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("Before withdrawing"+this.account.getBalance());
        for (int i = 0; i < 10; i++) {
            account.withdrawFromAccount(500);
            System.out.println("Account Balance"+account.getBalance());
        }
    }
}
