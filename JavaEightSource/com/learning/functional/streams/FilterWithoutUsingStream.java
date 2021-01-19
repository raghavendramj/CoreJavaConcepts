package com.learning.functional.streams;

import java.util.ArrayList;
import java.util.List;


public class FilterWithoutUsingStream {

    public static void main(String[] args) {

        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile("S21", 125452, 1000, "Samsung"));
        mobileList.add(new Mobile("Nord", 12212, 500, "OnePlus"));
        mobileList.add(new Mobile("11", 2502145, 1200, "Apple"));
        mobileList.add(new Mobile("Note Pro", 985012, 350, "Xaomi"));

        List<Mobile> cheaperMobileList = new ArrayList<>();
        for(Mobile mobile: mobileList){
            if(mobile.price < 600)
                cheaperMobileList.add(mobile);
        }

        System.out.println(cheaperMobileList);

    }
}
