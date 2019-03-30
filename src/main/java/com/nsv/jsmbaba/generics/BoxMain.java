package com.nsv.jsmbaba.generics;

public class BoxMain {
    public static void main(String[] args) {
        Box lbox = new Box();
        lbox.setObject(1L);

        Box sbox = new Box();
        sbox.setObject("Naga");

        Object lboxobject = lbox.getObject();
        Object sboxObject = sbox.getObject();
    }
}
