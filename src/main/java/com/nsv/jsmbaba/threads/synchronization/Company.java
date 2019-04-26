package com.nsv.jsmbaba.threads.synchronization;

public class Company implements Runnable {
    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("Before depositing"+this.account.getBalance());
        for (int i = 0; i < 10; i++) {
            this.account.depositToAccount(1000);
            System.out.println("Account Balance"+account.getBalance());
        }
    }
}
