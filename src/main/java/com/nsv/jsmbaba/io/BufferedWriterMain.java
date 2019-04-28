package com.nsv.jsmbaba.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {
    public static void main(String[] args) throws IOException {

        String msg = "Hi JSM; How are you ?\n Wassup";

        FileWriter fileWriter = new FileWriter(new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\bufferedreaderfile.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(msg);
        bufferedWriter.close();
        fileWriter.close();

    }
}
