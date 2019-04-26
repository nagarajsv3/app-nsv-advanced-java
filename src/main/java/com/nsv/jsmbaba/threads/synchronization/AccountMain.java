package com.nsv.jsmbaba.threads.synchronization;

public class AccountMain {
    public static void main(String[] args) {

        ThreadGroup accountsgroup = new ThreadGroup("accountsgroup");
        Account account = new Account();
        Runnable runnable = new AccountRunnable(account);

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(accountsgroup, runnable );
            thread.start();
        }

        while(true){
            if(accountsgroup.activeCount()==0) break;
        }

        System.out.println(account);





    }
}
