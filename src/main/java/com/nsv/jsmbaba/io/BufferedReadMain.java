package com.nsv.jsmbaba.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadMain {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\bufferedreaderfile.txt"));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while(line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        fileReader.close();


    }
}
