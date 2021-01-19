package com.learning.functional.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {


        static String displayDetailsOfStudent(String name, int age){
            String returnString = "Name of the Student is "+ name + " and age is "+ age;
            System.out.println(returnString);
            return returnString;
        }


        static void printMapDetails(Map<Integer, String> hashMap, String mapName){
            System.out.println("The contents of the map "+ mapName + " are..");
            hashMap.forEach((key, value) -> System.out.println("Employee Id : "+ key +" belongs to "+ value));
        }

        static void printDetails(Integer key, String value){
            System.out.println("Employee Id : "+ key +" belongs to "+ value);
        }


        public static void main(String[] args) {

            //By Method Reference
            BiConsumer<String, Integer> biConsumer = BiConsumerExample::displayDetailsOfStudent;

            biConsumer.accept("Jay", 20);
            biConsumer.accept("Janaki Ram", 22);

            //By Lambda Expression
            BiConsumer<String ,String> biConsumerSecond = (name, place) -> System.out.println(name + " lives in "+ place);
            biConsumerSecond.accept("Rami Reddy", "Hydreabad");
            biConsumerSecond.accept("Vinay", "Delhi");

            Map<Integer, String> hashMap = new HashMap<>();
            hashMap.put(100, "Vinay");
            hashMap.put(101, "Jay");
            hashMap.put(102, "Rami Reddy");
            hashMap.put(103, "Janaki Ram");

            //By Lambda Expression
            hashMap.forEach((key, value) -> System.out.println("Employee Id : "+ key +" belongs to "+ value));

            //By Method Reference
            hashMap.forEach(BiConsumerExample::printDetails);


            BiConsumer<Map<Integer, String>, String> biConsumerForMap = BiConsumerExample::printMapDetails;
            biConsumerForMap.accept(hashMap, "Employee");
    }
}
