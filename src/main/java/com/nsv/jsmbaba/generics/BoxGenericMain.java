package com.nsv.jsmbaba.generics;

public class BoxGenericMain {
    public static void main(String[] args) {
        BoxGeneric<Long> longBox = new BoxGeneric<>();
        longBox.setT(2L);

        BoxGeneric<String> stringBox = new BoxGeneric<>();
        stringBox.setT("StringBox");

        Long longBoxType = longBox.getT();
        String stringBoxType = stringBox.getT();


    }
}
