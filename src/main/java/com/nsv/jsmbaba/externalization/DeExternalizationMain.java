package com.nsv.jsmbaba.externalization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeExternalizationMain {

    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee naga = (Employee) ois.readObject();
            Employee dhoni = (Employee) ois.readObject();
            System.out.println(naga.toString()+ naga.COUNTRY);
            System.out.println(dhoni.toString() + dhoni.COUNTRY);
            fis.close();
            ois.close();
            System.out.println("Deserialization completed");
        }catch(IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
