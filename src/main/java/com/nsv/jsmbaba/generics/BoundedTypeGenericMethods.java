package com.nsv.jsmbaba.generics;

public class BoundedTypeGenericMethods {

    public <T> void printAnything(T anytype){
        System.out.println(anytype);
    }

    public <T extends Number> void acceptAnyNumberType(T anytype){
        System.out.println(anytype);
    }

    public <K,V> K acceptPair(K key, V value){
        return key;
    }


    public  <T>int numberOfOccurences(T number, T[] numbers){
        int count = 0;
        for (T no: numbers) {
            if(number.equals(no)){
                count++;
            }
        }
        return count;
    }
}
