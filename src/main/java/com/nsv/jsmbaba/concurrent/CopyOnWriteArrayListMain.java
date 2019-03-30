package com.nsv.jsmbaba.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListMain {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> colors = new CopyOnWriteArrayList<>();
        colors.add("red");
        colors.add("white");
        colors.add("black");

        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("black")){
                colors.add("blue");
            }
        }
        System.out.println(colors);

        Iterator<String> iterator1 = colors.iterator();
        while(iterator1.hasNext()){
            String next = iterator1.next();
            if(next.equals("black")){
                iterator1.remove();
            }
        }
        System.out.println(colors);


    }
}
