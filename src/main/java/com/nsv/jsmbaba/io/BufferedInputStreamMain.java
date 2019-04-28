package com.nsv.jsmbaba.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamMain {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\JSMBABA\\IdeaProjects\\Appi\\TempFiles\\bufoutstrm.txt"));
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] content = new byte[1024];
        int pos = 0;

        while((pos=bis.read(content)) != -1){
            System.out.print(pos+"\t");
            System.out.print(String.valueOf(content)+"\t");
            System.out.print(new String(content,0,pos)+"\t");
        }

        bis.close();
        fis.close();

    }
}
