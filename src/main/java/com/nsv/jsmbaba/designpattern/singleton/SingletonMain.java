package com.nsv.jsmbaba.designpattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {

        LastBook lastAvailableBook = LastBook.getMeASingletonInstance();
        LastBook lastAvailableBook2 = LastBook.getMeASingletonInstance();

        System.out.println(lastAvailableBook);
        System.out.println(lastAvailableBook2);

    }
}
