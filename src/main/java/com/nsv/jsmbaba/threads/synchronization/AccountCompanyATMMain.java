package com.nsv.jsmbaba.threads.synchronization;

public class AccountCompanyATMMain {
    public static void main(String[] args) throws InterruptedException {

        Account account = new Account();
        account.setBalance(1000);

        Company company = new Company(account);
        ATM atm = new ATM(account);

        Thread companyThread = new Thread(company);
        companyThread.start();

        Thread atmThread = new Thread(atm);
        atmThread.start();

        companyThread.join();
        atmThread.join();

        System.out.println("account"+account);



    }
}
