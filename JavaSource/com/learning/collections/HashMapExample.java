package com.learning.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        hashMap.put(71, 90);
        hashMap.put(85, 45);
        hashMap.put(21, 89);
        hashMap.put(34, 51);

        System.out.println(hashMap);


        System.out.println(hashMap.get(34));

        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());


        for (Integer key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            System.out.println(" hashMap.keySet() -- Key: " + key);
            System.out.println(" hashMap.keySet() --  Value: " + value);
        }


        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(" hashMap.entrySet() --  Key: " + key);
            System.out.println(" hashMap.entrySet() --   Value: " + value);

        }


        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()){
            Integer key = iterator.next();
            Integer value = hashMap.get(key);

            System.out.println(" hashMap.keySet().iterator() -- Key: " + key);
            System.out.println(" hashMap.keySet().iterator() --  Value: " + value);
        }

    }
}
