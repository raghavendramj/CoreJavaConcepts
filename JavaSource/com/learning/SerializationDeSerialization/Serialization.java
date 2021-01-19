package com.learning.SerializationDeSerialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) {

        Employee employee = new Employee(123, "Raghavendra", "raghavpass");

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("myObjectState.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(employee);
            out.flush();

            out.close();


            System.out.println("Success!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
