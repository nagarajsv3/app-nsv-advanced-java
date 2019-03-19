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

    }

    private static void readFileFinally() {
        FileReader reader = null;
        Connection connection = null;
        try {
            reader = new FileReader("abc.txt");
            connection = DriverManager.getConnection("url","user","password");
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
