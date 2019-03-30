package com.nsv.jsmbaba.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericSubTypeMain {

    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();

        Cat cat = new Cat();

        catList.add(cat);
        animalList.add(cat);

        doSomeThingWithAnimals(animalList);
        doSomeThingWithCats(catList);

    }

    private static void doSomeThingWithAnimals(List<Animal> animalList) {
    }

    private static void doSomeThingWithCats(List<Cat> catList) {
    }
}
