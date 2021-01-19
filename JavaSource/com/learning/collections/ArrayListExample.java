package com.learning.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println(myList);
        System.out.println(myList.get(2));

        myList.remove(2);
        System.out.println(myList);
        myList.add(3, 50);
        System.out.println(myList.get(2));

        List<Integer> secList = new ArrayList<>();
        secList.add(23);
        secList.add(34);
        secList.add(36);
        secList.add(67);
        System.out.println(secList);

        myList.addAll(secList);
        System.out.println(myList);

        myList.removeAll(secList);
        System.out.println(myList);

        myList.clear();
        System.out.println(myList);

    }
}
