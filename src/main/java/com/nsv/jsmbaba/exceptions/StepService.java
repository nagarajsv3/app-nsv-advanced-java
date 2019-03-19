package com.nsv.jsmbaba.exceptions;

public class StepService {

    public static void main(String[] args){
        step1();
        step2();
        try {
            step3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        step4();
    }

    private static void step1() {
        System.out.println("Executing Step1");
        System.out.println("Executed Step1");
    }

    private static void step2() {
        System.out.println("Executing Step2");
        System.out.println("Executed Step2");
    }

    private static void step3() throws Exception {
        System.out.println("Executing Step3");
        //some error happened
        //throw new StepFailedRuntimeException("Step 3 Failed"); //RunTimeException
        throw new Exception("Step 3 Failed"); //CheckedException
        //System.out.println("Executed Step3");
    }

    private static void step4() {
        System.out.println("Executing Step4");
        System.out.println("Executed Step4");
    }
}
