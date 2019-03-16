package com.nsv.jsmbaba.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionMain {

    //static Author author ; //NullPointerException as author is not initialised
    static Author author = new Author();

    public static void main(String[] args) throws FileNotFoundException, SQLException {

        //NullPointerException
        author.setName("Naga");
        author.setAge(29);

        //ArrayIndexOutOfBoundsException
        int[] numbers = {1,2,3,4,5};
        //System.out.println(numbers[10]); //ArrayIndexOutOfBoundsException
        System.out.println(numbers[4]);


        readFile();
        connectToDB();


        readFileAndConnectToDB();
        readFileAndConnectToDBInJava7();
        readFileAndConnectToDBUsingThrows();



    }

    private static void readFileAndConnectToDBUsingThrows() throws FileNotFoundException, SQLException {
        FileReader fileReader = new FileReader("a.txt");
        Connection connection = DriverManager.getConnection("jdbcurl","user","password");
    }

    private static void extractPrint() {
        System.out.println();
        System.out.println();
    }

    private static void readFileAndConnectToDB() {
        try {
            FileReader reader = new FileReader("a.txt");
            Connection connection = DriverManager.getConnection("jdbcurl","userid","pasword");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readFileAndConnectToDBInJava7() {
        try {
            FileReader reader = new FileReader("a.txt");
            Connection connection = DriverManager.getConnection("jdbcurl","userid","pasword");
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try {
            //FileReader fileReader = new FileReader("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\app-nsv-advanced-java\\src\\main\\resources\\customers.txt");
            FileReader fileReader = new FileReader("file1.txt");
            System.out.println("Inside try1 block File file1.txt is read");
        } catch (FileNotFoundException e) {
            try {
                FileReader fileReader2 = new FileReader("file2.txt");
            } catch (FileNotFoundException e1) {
                System.out.println("Inside catch2 block File file1.txt is read");
                e1.printStackTrace();
            }
            System.out.println("Inside catch1 block File file1.txt is read");
            e.printStackTrace();
        }
        System.out.println("Resumed execution ");
    }

    private static void connectToDB() {
        try {
            Connection connection = DriverManager.getConnection("someurl","someuserid","somepassword");
        } catch (SQLException e) {
            try {
                Connection connection1 = DriverManager.getConnection("someurl","someuserid","somepassword");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }

}
