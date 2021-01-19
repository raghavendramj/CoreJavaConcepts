package com.learning.elite.cafe;

public class CallStackExample {

    public void methodOne(){
        int a =10;
        int b = 20;


        System.out.println("methodOne");
        methodTwo();
    }

    public void methodTwo(){
        int a =10;
        int b = 20;

        System.out.println("methodTwo");
        methodThird();
    }

    public void methodThird(){
        int a =10;
        int b = 20;

        System.out.println("methodThird");
        methodFourth();
    }

    public void methodFourth(){
        int a =10;
        int b = 20;

        System.out.println("methodFourth");
        methodFifth();
    }

    public void methodFifth(){
        int a =10;
        int b = 20;

        System.out.println("methodFifth");
    }

    public static void main(String[] args) {


        int a =10;
        int b = 20;

        CallStackExample example = new CallStackExample();
        example.methodOne();

    }
}
