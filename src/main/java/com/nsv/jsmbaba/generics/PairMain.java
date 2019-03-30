package com.nsv.jsmbaba.generics;

public class PairMain {
    public static void main(String[] args) {
        Pair<Integer,String> integerStringPair = new Pair<>();
        integerStringPair.setKey(1);
        integerStringPair.setValue("One");

        Integer key = integerStringPair.getKey();
        String value = integerStringPair.getValue();
        System.out.println(key+"="+value);

        Pair<String, String> stringsPair = new Pair<>();
        stringsPair.setKey("NAME");
        stringsPair.setValue("NAGA");

        String stringsPairKey = stringsPair.getKey();
        String stringsPairValue = stringsPair.getValue();
        System.out.println(stringsPairKey+"="+stringsPairValue);



    }
}
