package com.nsv.jsmbaba.exceptions;

public class OrderNotFoundCheckedException extends Exception{

    public OrderNotFoundCheckedException(){
        super();
    }

    public OrderNotFoundCheckedException(String message){
        super(message);
    }
}
