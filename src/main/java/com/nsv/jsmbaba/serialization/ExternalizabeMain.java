package com.nsv.jsmbaba.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizabeMain {

    public static void main(String[] args) {

        Employee naga = new Employee(1L,"Naga","Developer","1234564561","");
        Employee dhoni = new Employee(2L, "Dhoni","Cricketer","9519519511","");

        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(naga);
            oos.writeObject(dhoni);
            fos.close();
            oos.close();
            System.out.println("Serialization completed - check employee.ser file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
