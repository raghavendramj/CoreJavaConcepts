package com.learning.exeception.handling;

import java.io.FileWriter;
import java.io.IOException;

public class HierarchyExample {


    public static void main(String[] args) {


        HierarchyExample example = new HierarchyExample();

        try {
            example.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
            e.printStackTrace();
        }

        System.out.println(" 1 --> ");


        try {
            FileWriter output = new FileWriter("output.txt");
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }

        System.out.println(" 2 --> ");


        try {
            Class.forName("com.learning.collections.comparable.Employee");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }

        System.out.println(" 3 --> ");

        try {

            int i = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }

        System.out.println(" 4 --> ");


        try {
            String name = null;
            name.equals("raghav");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            e.printStackTrace();
        }

        System.out.println(" End of Main --> ");

    }


}
