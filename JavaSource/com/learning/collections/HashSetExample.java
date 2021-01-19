package com.learning.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> hashSet = new TreeSet();
        hashSet.add(23);
        hashSet.add(23);
        hashSet.add(12);
        hashSet.add(45);
        hashSet.add(45);
        hashSet.add(67);
        hashSet.add(67);
        //System.out.println(hashSet);

        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            Integer val = iterator.next();
            System.out.print(val + " ");
        }
    }
}
