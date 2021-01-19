package com.learning.collections;

public class StaticBlock {

    static {
        System.out.println("My Static Block");
        System.exit(1);
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method!");
        new StaticBlock();
    }
}
