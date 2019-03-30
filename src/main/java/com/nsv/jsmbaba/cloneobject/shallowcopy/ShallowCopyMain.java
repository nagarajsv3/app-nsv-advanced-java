package com.nsv.jsmbaba.cloneobject.shallowcopy;

public class ShallowCopyMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Author naga = new Author();
        naga.setId("N1");
        naga.setName("Naga");

        Author baba = naga.clone();

        System.out.println(naga);
        System.out.println(baba);
        System.out.println("--------------");
        System.out.println("----updating cloned object----");
        baba.setId("A1");
        baba.setName("Baba");
        System.out.println(naga);
        System.out.println(baba);


    }
}
