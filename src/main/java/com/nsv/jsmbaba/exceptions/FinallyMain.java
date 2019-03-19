package com.nsv.jsmbaba.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyMain {
    public static void main(String[] args) {
        readFileFinally();
        System.out.println("-------------------");
        readFileWithResources();

    }

    private static void readFileFinally() {
        FileReader reader = null;
        Connection connection = null;
        try {
            System.out.println("Inside try block");
            //reader = new FileReader("abc.txt");
            System.out.println("File Reader - Success");
            //connection = DriverManager.getConnection("url","user","password");
        //} catch (FileNotFoundException | SQLException e) {
        } catch (Exception e) {
            System.out.println("caught exception");
            e.printStackTrace();
        } finally {
            System.out.println("inside finally block");
            if(reader != null){
                try {
                    System.out.println("closing the file reader");
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readFileWithResources() {
        Connection connection = null;
        try(FileReader reader = new FileReader("readme.txt")) {
            connection = DriverManager.getConnection("url","user","password");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }


}
