package com.learning.SerializationDeSerialization;

import java.io.*;

public class Deserialization {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("myObjectState.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Employee employee = (Employee) in.readObject();
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
