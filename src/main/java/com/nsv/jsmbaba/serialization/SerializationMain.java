package com.nsv.jsmbaba.serialization;


import java.io.*;

public class SerializationMain{

    public static void main(String[] args) {

        Employee naga = new Employee(1L,"Naga","Developer","1234564561","");
        Employee dhoni = new Employee(2L, "Dhoni","Cricketer","9519519511","");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("employee.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(naga);
            oos.writeObject(dhoni);
            System.out.println("Serialization completed - check employee.ser file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null) fos.close();
                if(oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
