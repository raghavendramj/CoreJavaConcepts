package com.learning.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static boolean isGreaterThan10(int number){
        return number > 10;
    }


    static boolean isLessThan10(int number){
        return number < 10;
    }

    static boolean isEqualThan10(int number){
        return number == 10;
    }

    public static void main(String[] args) {

        Predicate<Integer> greaterThan10 = PredicateExample::isGreaterThan10;
        System.out.println(" Is 12 greater than 10 ? "+ greaterThan10.test(12));


        Predicate<Integer> lessThan10 = PredicateExample::isLessThan10;
        System.out.println(" Is 15 lesser than 10 ? "+ lessThan10.test(15));

        Predicate<Integer> equalThan10 = PredicateExample::isEqualThan10;
        System.out.println(" Is 10 equal to 10 ? "+ equalThan10.test(12));

        Predicate<Integer> notEqualToTen = (number) -> number != 10;
        System.out.println(" Is 20 not equal to 10 ? "+ notEqualToTen.test(12));

    }
}
