package com.nsv.jsmbaba.designpattern.singleton;

import java.awt.print.Book;

public class LastBook {

/*    //Type 1
    private static LastBook lastBook;
    private LastBook(){
        if(lastBook!=null){
            throw new RuntimeException("Object cant be created");
        }
    }

    public static LastBook getMeASingletonInstance(){
        lastBook = (lastBook != null) ? lastBook : new LastBook();
        return lastBook;
    }*/



//Type 2 - Used to avoid Breaking of singleton pattern using Reflection
    private static LastBook lastBook = new LastBook();
    private LastBook(){
        if(lastBook != null){
            throw new RuntimeException("Object can not be created");//throw exception if attempt is made to break singleton pattern using Reflection
        }
    }

    public static LastBook getMeASingletonInstance(){
        lastBook = (lastBook != null) ? lastBook : new LastBook();
        return lastBook;
    }

}
