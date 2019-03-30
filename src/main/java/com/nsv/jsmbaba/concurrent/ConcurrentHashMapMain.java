package com.nsv.jsmbaba.concurrent;

import java.util.concurrent.ConcurrentHashMap;
//Thread Safe SegmentBased HashMap
//Update operations are not synchronized
public class ConcurrentHashMapMain {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> numbers = new ConcurrentHashMap<>();
        numbers.put(1,"ONE");
        numbers.put(2,"TWO");
        numbers.putIfAbsent(3,"THREE");
        System.out.println(numbers);


    }
}
