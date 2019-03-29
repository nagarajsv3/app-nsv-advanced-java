package com.nsv.jsmbaba.nestedclass;

public class OuterClassMain {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.NestedInnerClass nestedInnerClass = outerClass.new NestedInnerClass();
        nestedInnerClass.innerClassMethod();

        OuterClass.NestedStaticInnerClass nestedStaticInnerClass = new OuterClass.NestedStaticInnerClass();
        nestedStaticInnerClass.staticClassMethod();

    }
}
