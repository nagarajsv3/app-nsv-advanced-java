package com.nsv.jsmbaba;

import com.nsv.jsmbaba.serialization.Employee;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTypesMain {
    public static void main(String[] args) {

        Employee employee = new Employee();//Strong reference
        employee = null;

        Employee employee1 = new Employee();//Strong reference

        WeakReference<Employee> weakReference = new WeakReference<>(employee1);//WeakReference-JVM does GC eagerly
        SoftReference<Employee> softReference = new SoftReference<>(employee1);//SoftReference-JVM does GC if it is absolutely needed

        ReferenceQueue<Employee> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Employee> phantomReference = new PhantomReference<>(employee1,referenceQueue);//PhantomReference-JVM does GC whenever it feels like




    }
}
