package com.learning.elite.cafe;

public class ArrayExample {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 34;
        arr[3] = 44;
        arr[4] = 54;

        int arr2[] = {101, 201, 301, 401};

        System.out.println("\n ----------- Normal For -----------------");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "   ");
        }

        System.out.println("\n ---------For Each!-------------------");

        for (int curr : arr2) {
            System.out.print(curr + "   ");
        }


        int twoDArray[][] = new int[3][3];

        int one[] = {1, 2, 3};
        int two[] = {4, 5, 6};
        int three[] = {7, 8, 9};

        twoDArray[0] = one;
        twoDArray[1] = two;
        twoDArray[2] = three;

        System.out.println("\n ---------2D Array for Each!-------------------");

        for(int outer[] : twoDArray){
            for(int inner : outer){
                System.out.print(inner+ "  ");
            }
            System.out.println();
        }

        System.out.println("\n ---------Object Array for Each!-------------------");

        Object objectArrar[] = {10, "String", true, 'A'};

        for(Object object : objectArrar){
            System.out.print(object+"  ");
        }




    }

}
