package com.nsv.jsmbaba.cloneobject.deepcopy;

public class DeepCopyMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee naga = new Employee();
        naga.setName("Naga");
        naga.setId("N1");

        Address nagasaddress = new Address();
        nagasaddress.setCity("Newark");
        nagasaddress.setState("DE");

        naga.setAddress(nagasaddress);

        Employee dhoni = naga.clone();

        System.out.println(naga);
        System.out.println(dhoni);
        System.out.println("Modify cloned dhonis details");
        dhoni.setId("D1");
        dhoni.setName("Dhoni");
        Address dhonisaddress = dhoni.getAddress();
        dhonisaddress.setState("JH");
        dhonisaddress.setCity("Ranchi");
        dhoni.setAddress(dhonisaddress);

        System.out.println("---After updating cloned object details----");
        System.out.println(naga);
        System.out.println(dhoni);
    }
}
