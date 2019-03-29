package com.nsv.jsmbaba.nestedclass;

public class OuterClass {
    private String name;
    private static final String COMPANY = "GOOGLE";

    class NestedInnerClass{
        void innerClassMethod(){
            name = "Naga";
            System.out.println(name+"\t"+COMPANY);
        }
    }

    static class NestedStaticInnerClass{
        void staticClassMethod(){
            //name = "Dhoni";
            System.out.println(COMPANY);
        }
    }

}
