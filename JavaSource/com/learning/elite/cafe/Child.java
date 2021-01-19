package com.learning.elite.cafe;

class Parent {
    public int add(int a, int b) {
        System.out.println(" From Parent Class");
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println(" From Parent Class");
        return a - b;
    }

    public int divide(int a, int b) {
        System.out.println(" From Parent Class");
        return a / b;
    }
}

public class Child extends Parent {

    public int add(int a, int b) {
        System.out.println(" Modified add method,  because parent's implemetation not according my requirement");
        int c = a + b;
        c = c + 5;
        return c;
    }


    public static void main(String args[]) {

        Child child = new Child();
        int sum = child.add(10, 20);

        child.subtract(20, 10);

        System.out.println(" Result: " + sum);
    }
}