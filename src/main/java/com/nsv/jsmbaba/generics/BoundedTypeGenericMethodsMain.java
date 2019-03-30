package com.nsv.jsmbaba.generics;

import com.nsv.jsmbaba.cloneobject.deepcopy.Employee;

public class BoundedTypeGenericMethodsMain {
    public static void main(String[] args) {

        BoundedTypeGenericMethods bt = new BoundedTypeGenericMethods();
        String[] colors = {"red","red","white","red"};
        int numberOfOccurences = bt.numberOfOccurences("red", colors);
        System.out.println("numberOfOccurences of red="+numberOfOccurences);

        Integer[] numbers = {1,2,3,4,5,1,1,1,1};
        int occurences = bt.numberOfOccurences(1, numbers);
        System.out.println("occurences of 1="+occurences);
        
        bt.printAnything(1);
        bt.printAnything("String");
        bt.printAnything(new Employee());
        
        bt.acceptAnyNumberType(1);
        bt.acceptAnyNumberType(29L);
        bt.acceptAnyNumberType(15.4);
        //bt.acceptAnyNumberType("Hi");

        Integer integer = bt.acceptPair(4, 5);
        String acceptPair = bt.acceptPair("Hi", "Hello");


    }
}
