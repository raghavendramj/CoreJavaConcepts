package com.learning.exeception.handling;

public class ExceptionHandlingExample {


    public static void testExeception() throws ClassNotFoundException {
        Class.forName("com.learning.collections.comparable.Employee");
    }

    public static void callTestExeception(){
        try {
            testExeception();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        try {
            //Class.forName("com.learning.collections.comparable.Employee");
            int x = 10;
            int y = x/10;



            System.out.println(y);
            throw new ArithmeticException(" Problem with code");

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(" Hey Bro i will execute for sure!");
        }

    }

}
