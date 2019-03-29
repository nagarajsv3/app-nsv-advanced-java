package com.nsv.jsmbaba.immutable;

public class ImmutableClassMain {

    public static void main(String[] args) {
        Shop shop = new Shop("Walmart","W1Branch");
        Pen pen = new Pen("ReyNolds","Black",shop);

        System.out.println(pen);

        shop.setStoreLocation("W2Branch");

        System.out.println(pen);


    }
}
