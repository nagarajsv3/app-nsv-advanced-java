package com.nsv.jsmbaba.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Book> bookClass = (Class<Book>) Class.forName(Book.class.getName());
        Constructor<Book>[] declaredConstructors = (Constructor<Book>[]) bookClass.getDeclaredConstructors();
        Constructor<Book> defaultConstructor = declaredConstructors[0];
        Book book = defaultConstructor.newInstance();
            book.setName("Book Name Set to ReflectionBook Using Reflection");
            book.setAuthor("Name Set to Naga Using Reflection");
        System.out.println(book.toString());
    }
}
