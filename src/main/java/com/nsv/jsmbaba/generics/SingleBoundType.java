package com.nsv.jsmbaba.generics;

public class SingleBoundType <T extends Animal> {
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    //singlebound at method argument
    public <T extends Animal>void doSomething(T type){

    }
}
