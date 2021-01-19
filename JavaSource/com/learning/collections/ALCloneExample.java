package com.learning.collections;

import java.util.ArrayList;

public class ALCloneExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("First List:"+ list);
        ArrayList<Integer> secondList =  (ArrayList<Integer>) list.clone();

        System.out.println("\nSecond List:"+ secondList);

    }
}
