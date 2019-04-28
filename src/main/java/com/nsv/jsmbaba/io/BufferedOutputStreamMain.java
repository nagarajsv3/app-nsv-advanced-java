package com.nsv.jsmbaba.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {
    public static void main(String[] args) throws IOException {

        String msg = "Hi Buddy Wassup!!!";

        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\bufoutstrm.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(msg.getBytes());
        bos.flush();
        bos.close();
        fos.close();

    }
}
