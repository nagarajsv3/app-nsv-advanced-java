package com.nsv.jsmbaba.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BreakSingletonUsingReflection {

    public static void main(String[] args) {

        try {
            Class<?> bookClass = Class.forName(LastBook.class.getName());//dynamic class loading
            Constructor<?> constructor = bookClass.getDeclaredConstructors()[0];
            constructor.setAccessible(true);

            Object lastBook = constructor.newInstance();
            Object lastBook2 = constructor.newInstance();
            System.out.println(lastBook);
            System.out.println(lastBook2);

        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException | InvocationTargetException | RuntimeException e) {
            e.printStackTrace();
        }
    }
}
