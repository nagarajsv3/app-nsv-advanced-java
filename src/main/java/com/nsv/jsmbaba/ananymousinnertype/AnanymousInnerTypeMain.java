package com.nsv.jsmbaba.ananymousinnertype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnanymousInnerTypeMain {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Customer c0 = new Customer("c0", "Naga", "Newark", 50);
        Customer c1 = new Customer("c1", "Naga", "Rehoboth", 10);
        Customer c2 = new Customer("c2", "Raja", "Grapevine", 2);
        Customer c3 = new Customer("c3", "Varnekar", "NewJersey", 3);
        Customer c4 = new Customer("c4", "Virat", "Delhi", 6);
        Customer c5 = new Customer("c5", "Rahul", "Karnataka", 100);

        customers.add(c0);
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        System.out.println("------Customers-Before Sorting------\n"+customers);

        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer firstCustomer, Customer secondCustomer) {
                return firstCustomer.getName().compareTo(secondCustomer.getName());
            }
        });
        System.out.println("------Customers-After Sorting using Name------\n"+customers);

        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer firstCustomer, Customer secondCustomer) {
                return firstCustomer.getCity().compareTo(secondCustomer.getCity());
            }
        });

        System.out.println("------Customers-After Sorting using City------\n"+customers);






    }
}
