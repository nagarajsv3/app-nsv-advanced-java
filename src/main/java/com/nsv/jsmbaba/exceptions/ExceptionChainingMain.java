package com.nsv.jsmbaba.exceptions;

public class ExceptionChainingMain {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Inside method1.Caught exception from method 2. Throwing a new exception",e);
        }
    }

    private static void method2() throws Exception {
        try {
            method3();
        } catch (Exception e) {
            throw new Exception("Inside method2.Caught exception from method 3. Throwing a new exception",e);
        }
    }

    private static void method3() throws Exception {
        try {
            method4();
        } catch (Exception e) {
            throw new Exception("Inside method3.Caught exception from method 4. Throwing a new exception",e);
        }
    }

    private static void method4() throws Exception {
        System.out.println("Inside method4");
        throw new Exception("Inside method4. Throwing expection!!! chain me if you can");
    }

}
