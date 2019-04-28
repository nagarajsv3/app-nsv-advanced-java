package com.nsv.jsmbaba.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public static void main(String[] args) throws IOException {
        String msg = "Hello Baba :) How are you ?";

        FileWriter fileWriter = new FileWriter(new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\filereaderfile.txt"));
        fileWriter.write(msg);
        fileWriter.close();

    }
}
