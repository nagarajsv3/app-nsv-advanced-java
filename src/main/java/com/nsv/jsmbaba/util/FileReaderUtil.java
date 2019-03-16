package com.nsv.jsmbaba.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReaderUtil {
    public static void main(String[] args) {
        System.out.println("\n----------------------------------------");
        FileReaderUtil readerUtil = new FileReaderUtil();
        readerUtil.readFileUsingBufferedInputStream();
        System.out.println("\n----------------------------------------");
    }

    private void readFileUsingBufferedInputStream() {
        //Exception Handling using try catch block
        try {
            //FileReader fileReader = new FileReader(new File("resources/customers.txt"));
            InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("files/file1.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
            while(bufferedInputStream.available() >0 ){
                System.out.print((char)bufferedInputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}