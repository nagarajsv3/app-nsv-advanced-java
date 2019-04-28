package com.nsv.jsmbaba.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamMain {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int x;
        while((x=fis.read()) != -1){
            System.out.print(x+":"+(char)x+" ");
        }
        fis.close();
    }
}
