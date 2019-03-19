package com.nsv.jsmbaba.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionInheritanceMain {

    public static void main(String[] args) {

        readFileAndCloseConnectionOnlyParent();
        readFileAndCloseConnectionBothChildAndParent();
    }

    private static void readFileAndCloseConnectionBothChildAndParent() {
        FileReader fileReader = null;
        Connection connection = null;
        try {
            fileReader = new FileReader("a.txt");
            connection = DriverManager.getConnection("url","username","password");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readFileAndCloseConnectionOnlyParent() {
        FileReader fileReader = null;
        Connection connection = null;
        try {
            fileReader = new FileReader("a.txt");
            connection = DriverManager.getConnection("url","username","password");
        } catch (Exception e) {
            e.printStackTrace();
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        } finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

    }
}
