package com.nsv.jsmbaba.generics;

public class MultipleBoundType <T extends Animal & PetStore>{
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    //multibound at method argument
    public <T extends Animal & PetStore>void doSomething(T type){

    }
}
