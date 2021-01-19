package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExample {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Rama");
        list.add("Sita");
        list.add("Lakshamana");
        list.add("Ravana");

        System.out.println(list);


        List<String> secondList = new ArrayList<>();
        Collections.addAll(secondList, "Benz", "BMW", "Audi", "Cayman");
        System.out.println(secondList);

        List<String> thirdList = new ArrayList<>();

        String arr[] = {"Benz", "BMW", "Audi", "Cayman"};
        Collections.addAll(thirdList, arr);
        System.out.println(thirdList);


        List<Integer> fourthList = new ArrayList<>();

        fourthList.add(34);
        fourthList.add(23);
        fourthList.add(56);
        fourthList.add(17);
        fourthList.add(48);
        fourthList.add(90);
        fourthList.add(12);
        fourthList.add(11);
        fourthList.add(4);
        System.out.println(fourthList);


        System.out.println("\nMax Element in the list is :"+ Collections.max(fourthList));
        System.out.println("\nMin Element in the list is :"+ Collections.min(fourthList));

        Collections.sort(fourthList);
        System.out.println("After Sorting: "+ fourthList);

        Collections.sort(fourthList, Collections.reverseOrder());
        System.out.println("After Sorting in reverse: "+ fourthList);


    }
}
