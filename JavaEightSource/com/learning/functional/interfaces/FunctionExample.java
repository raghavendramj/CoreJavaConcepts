package com.learning.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    static int addListOfNumbers(List<Integer> list) {
        int result = list.stream().mapToInt(Integer::intValue).sum();
        return result;
    }

    public static void main(String[] args) {

        //Function<String, String> function = (state,capitalCity) -> System.out.println(capitalCity +" is the capital city of "+ state);
        Function<String, String> function = (state) -> {
            String returnString = "Name of the state is " + state;
            System.out.println(returnString);
            return returnString;
        };

        String returnString = function.apply("Chennai");
        System.out.println("Returned Value is: " + returnString);


        //Method Reference
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        Function<List<Integer>, Integer> functionList = FunctionExample::addListOfNumbers;
        int result = functionList.apply(numbers);
        System.out.println("Sum of list values : " + result);

    }

}
