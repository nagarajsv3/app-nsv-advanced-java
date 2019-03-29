package com.nsv.jsmbaba.nestedclass;

public class ShadowTest {

    private String x="OuterClassInstamceValue";

    class InnerClass{
        private String x="InnerClassInstamceValue";

        public void innerClassMethod(String x){
            System.out.println("Local Variable="+x);
            System.out.println("InnerClass Instance Variable="+this.x);
            System.out.println("OuterClass ShadowTest Instance Variable="+ShadowTest.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowTest outerClass = new ShadowTest();
        ShadowTest.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerClassMethod("LocalVariableValue");
    }
}
