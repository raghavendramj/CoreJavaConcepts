package com.learning.elite.cafe;


public class CompileTimePolymorphism {

    private int add(int a, int b) {
        System.out.println("int, int");
        return a + b;
    }

    private long add(long a, int b) {
        System.out.println("long, int");
        return a + b;
    }

    private long add(long a, long b) {
        System.out.println("long, long");
        return a + b;
    }

    private int add(int a, int b, int c) {
        System.out.println("int, int, int");
        return a + b + c;
    }


    public static void main(String[] args) {

        CompileTimePolymorphism object = new CompileTimePolymorphism();
        System.out.println("Result is :" + object.add(10, 10));
        System.out.println("Result is :" + object.add(Long.MAX_VALUE, 10));
        System.out.println("Result is :" + object.add(Long.MAX_VALUE, Long.MAX_VALUE));
    }


}
