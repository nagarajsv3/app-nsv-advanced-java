package com.nsv.jsmbaba.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\filereaderfile.txt"));

        int x;

        while( (x=fr.read()) != -1){
            System.out.print((char)x);
        }

        fr.close();




    }
}
