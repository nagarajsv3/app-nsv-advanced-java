package com.nsv.jsmbaba.generics.example;

import java.util.ArrayList;
import java.util.List;

public class GenericsExMain {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<String> colors = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);

        colors.add("Hi");
        colors.add("Hey");

        List objects = new ArrayList(); //raw data structure
        objects.add(1);
        objects.add("Hi");

        String s = (String)objects.get(0);

    }
}
