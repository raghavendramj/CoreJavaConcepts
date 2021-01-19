package com.learning.elite.cafe;

public class StringExample {


    public static void main(String[] args) {

        String greet= "Good Morning!";
        greet = "Good Afternoon";
        greet = "Good Evening";
        System.out.println(greet);
        System.out.println(greet.length());
        System.out.println(greet.toUpperCase());
        System.out.println(greet.indexOf("Evening"));

        String fistName = "AIMORC";
        String lastName ="Innovations";
        String result1 = fistName + " " + lastName;
        String result2 = fistName.concat(lastName);

        System.out.println(result1);
        System.out.println(result2);

        if(10 > 15){
            System.out.println("Its greater!");
        } else {
            System.out.println("Its not!");
        }

        switch (12) {

            case 1:
                System.out.println("Case 1 is executing");
                break;
            case 2:
                System.out.println("Case 2 is executing");
                break;
            case 3:
                System.out.println("Case 2 is executing");
                break;

                default:
                    System.out.println("Nothing macthed!");

        }

        int day = 14;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a matching day! Sorry!");
                break;
        }
        System.out.println("\n----------------------> ");

        int i=0;

        while (i<5){
            System.out.println(i);
            i++;
        }
        System.out.println("\n----------------------> ");

        int j=10;
        do {
            System.out.println(j);
            j++;
        } while (j<15);
        System.out.println("\n----------------------> ");

        for( int k=20; k<25; k++){

            if( k == 23)
                continue;
            System.out.println(k);
        }
        System.out.println("\n----------------------> ");


        int array[] = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;


        for(int l = 0; l < array.length ; l++ ){
            System.out.println(array[l]);
        }

        System.out.println("\n----------------------> ");

        String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars[0]);




    }



}
