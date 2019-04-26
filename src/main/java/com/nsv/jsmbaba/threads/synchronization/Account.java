package com.nsv.jsmbaba.threads.synchronization;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Getter
@Setter
@ToString
public class Account {
    private int balance;
    private Lock lock = new ReentrantLock();

    synchronized void incrementby10(){
        this.balance = this.balance + 10;
    }

    //using lock
    void incrementby10SyncUsingLock(){
        lock.lock();
        this.balance = this.balance + 10;
        lock.unlock();
    }

    public synchronized void depositToAccount(int amount){
        this.balance= this.balance + amount;
    }

    public synchronized void withdrawFromAccount(int amount){
        this.balance= this.balance - amount;
    }



    void incrementby10usingSyncBlock(){
        synchronized (this) {
            this.balance = this.balance + 10;
        }
    }

    static synchronized void printsomething(){
        System.out.println("static sync");
    }


}
