package com.nsv.jsmbaba.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTest {
    public static void main(String[] args) {

        // {2,5}{4,8}{6,12}{13,18}{19,22}{21,25} -- {2,12}{13,18}{19,25}

        int x[] = {2, 5};

        List<Integer> numbers = new ArrayList<>();
        Integer[] a = {2, 5};
        Integer[] b = {4, 8};
        Integer[] c = {6, 12};
        Integer[] d = {13, 18};
        Integer[] e = {19, 22};
        Integer[] f = {21, 25};

        numbers.addAll(Arrays.asList(a));
        numbers.addAll(Arrays.asList(b));
        numbers.addAll(Arrays.asList(c));
        numbers.addAll(Arrays.asList(d));
        numbers.addAll(Arrays.asList(e));
        numbers.addAll(Arrays.asList(f));

        List<Integer> resultNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (i == 0) {
                resultNumbers.add(numbers.get(i));
            } else if (i == numbers.size() - 2) {
                resultNumbers.add(numbers.get(i + 1));
            } else if ((numbers.get(i + 1) - numbers.get(i)) == 1) {
                resultNumbers.add(numbers.get(i));
                resultNumbers.add(numbers.get(i + 1));
            }
        }

        List<Integer[]> numberArrays = new ArrayList<>();

        for (int i = 0; i < resultNumbers.size() - 1; i = i + 2) {
            Integer[] array = {resultNumbers.get(i), resultNumbers.get(i + 1)};
            numberArrays.add(array);
        }

        System.out.println(" " + resultNumbers + "\n" + numberArrays.toString());


        // allnumbers.addAll(Arrays.asList({2,5}));


    }

}
