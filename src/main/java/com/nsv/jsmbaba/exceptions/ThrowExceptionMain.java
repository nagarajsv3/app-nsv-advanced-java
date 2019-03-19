package com.nsv.jsmbaba.exceptions;

import java.util.Arrays;
import java.util.List;

public class ThrowExceptionMain {

    static List<String> orders = Arrays.asList("1","2","3");

    public static void main(String[] args) {

        System.out.println("------throw runtime exception--------");
        //priceCheckThrowIllegalArgumentException(1000);

        System.out.println("------throw checked exception--------");
        try {
            priceCheckThrowCheckedException(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Price check stage 1 completed");

        System.out.println("------throw custom checked exception OrderNotFoundCheckedException--------");
        try {
            getTheOrderIfPresent("1");
            getTheOrderIfPresent("6");
        } catch (OrderNotFoundCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("------throw custom runtime exception StepFailedRuntimeException--------");
    }

    private static String getTheOrderIfPresent(String orderId) throws OrderNotFoundCheckedException {
        if(orders.contains(orderId)){
            for (String order: orders) {
                if(order.equals(orderId)){
                    System.out.println("Order is found"+order);
                    return order;
                }
            }
        }else{
            System.out.println("Order is not found"+orderId);
            throw new OrderNotFoundCheckedException("Given Order Is Not Found");
        }
        return null;
    }

    private static void priceCheckThrowCheckedException(int i) throws Exception {
        if(i>100){
            throw new Exception("Price is invalid");
        }
    }

    private static void priceCheckThrowIllegalArgumentException(int i) {
        if(i > 100){
            throw new IllegalArgumentException("Price is invalid");
            //System.out.println("Price is invalid"); //unreachable statement
        }
    }

}
