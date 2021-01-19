package com.learning.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static void printMessage(String nameOfTheEmployee){
        System.out.println("via Method Reference.... Hey "+ nameOfTheEmployee);
    }

    static void addListOfNumbers(List<Integer> list){

        int result = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(" Sum of list values : "+ result);
    }



    public static void main(String[] args) {

        //Method Reference
        Consumer<String> consumer = ConsumerExample::printMessage;
        consumer.accept("Rami Reddy");
        consumer.accept("Janaki Ram");

        //Lambda Expression
        Consumer<String> consumerSecond = (nameOfTheEmployee) -> System.out.println("via Lambda Expression.... Hey "+ nameOfTheEmployee);
        consumerSecond.accept("Rami Reddy");
        consumerSecond.accept("Janaki Ram");


        //Method Reference
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        System.out.println(numbers);


        Consumer<List<Integer>> consumerList = ConsumerExample::addListOfNumbers;
        consumerList.accept(numbers);


        List<Integer> numbersFromCollectiosClass = new ArrayList<>();
        Collections.addAll(numbersFromCollectiosClass, 10, 20, 30, 40);
        System.out.println(numbersFromCollectiosClass);

        //Lambda Expression
        Consumer<List<Integer>> listConsumerSecond = (numberList) -> {
            System.out.println(" Sum of list values : " + numberList.stream().mapToInt(Integer::intValue).sum());
        };
        listConsumerSecond.accept(numbersFromCollectiosClass);



    }
}
