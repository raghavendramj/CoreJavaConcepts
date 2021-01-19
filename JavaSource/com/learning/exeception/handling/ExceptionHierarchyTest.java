package com.learning.exeception.handling;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHierarchyTest {

    public static void main(String[] args) {

        ExceptionHierarchyTest example = new ExceptionHierarchyTest();


        try {
            String name = null;
            name.equals("raghav");
            Class.forName("com.learning.collections.comparable.Employee");
            int i = 10 / 0;
            example.clone();
        }


        catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
            e.printStackTrace();
        }

        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
            e.printStackTrace();
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
        catch (Throwable e) {
            System.out.println("Throwable");
            e.printStackTrace();
        }
        System.out.println(" End of Main --> ");

    }
}
