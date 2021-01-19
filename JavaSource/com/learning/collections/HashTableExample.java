package com.learning.collections;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Raghav");
        hashtable.put(20, "Keshav");
        hashtable.put(30, "Madhav");

        System.out.println(hashtable);

    }
}
