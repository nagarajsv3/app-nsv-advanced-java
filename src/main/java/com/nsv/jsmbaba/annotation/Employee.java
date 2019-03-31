package com.nsv.jsmbaba.annotation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@MyAnnotation
public class Employee {


    @MyAnnotation
    private String name;
    private String id;

    @Deprecated
    public void login(){
        System.out.println("Login to system");
    }

    @MyAnnotation
    public void loginNew(){
        System.out.println("Login to system with security");
    }

    @SuppressWarnings(value = {"rawtypes"})
    public void addEmployees(){
        List al = new ArrayList();
        al.add("Hi");
        al.add(1);
    }

    @Override
    public String toString() {
        return name+" "+id;
    }
}
