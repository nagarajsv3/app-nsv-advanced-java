package com.nsv.jsmbaba.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {

    public static void main(String[] args) throws IOException {

        String msg = "Payment Processed";
        File hellofile = new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\hello.txt");
        FileOutputStream fos = null;

        fos = new FileOutputStream(hellofile);
        fos.write(msg.getBytes());
        fos.close();


    }
}
