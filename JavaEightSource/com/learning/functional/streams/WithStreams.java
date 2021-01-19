package com.learning.functional.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WithStreams {

    public static void main(String[] args) {

        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile("S21", 125452, 1000, "Samsung"));
        mobileList.add(new Mobile("Nord", 12212, 500, "OnePlus"));
        mobileList.add(new Mobile("11", 2502145, 1200, "Apple"));
        mobileList.add(new Mobile("Note Pro", 985012, 350, "Xaomi"));

        Stream<Mobile> cheaperMobileStream = mobileList.stream().filter(mobile -> mobile.price < 600);

        List<Mobile> cheaperMobileList = cheaperMobileStream.collect(Collectors.toList());
        System.out.println(cheaperMobileList);


        Stream<Mobile>  cheaperMobileStream2 = mobileList.stream().filter(mobile -> mobile.price < 600);
        List<Float> cheaperMobilePriceList = cheaperMobileStream2.map(mobile -> mobile.price).collect(Collectors.toList());
        System.out.println("Prices of all the cheaper mobiles: "+ cheaperMobilePriceList);


        List<Integer> listOfNumbers = Stream.iterate(0, (element) -> element + 2).limit(20).collect(Collectors.toList());
        System.out.println(listOfNumbers);

        Stream.iterate(0, (element) -> element + 2).limit(20).forEach(System.out::println);


        float result = mobileList.stream().filter(mobile -> mobile.price < 600).map(mobile -> mobile.price).reduce(0.0f, Float::sum);

        //Using custom sum method
        float resultCustom = mobileList.stream().filter(mobile -> mobile.price < 600).map(mobile -> mobile.price).reduce(0.0f,  (seed, number) -> number + seed);
        System.out.println("Sum of cheaper phones cost all together: "+ resultCustom);


        //Mobile maxPricedMobile = mobileList.stream().max((mobile1, mobile2) -> mobile1.price > mobile2.price ? 1 : -1).get();
        Mobile maxPricedMobile = mobileList.stream().max((mobile1, mobile2) -> {
            if(mobile1.price > mobile2.price)
                return  1;
            else
                return -1;

        }).get();

        System.out.println("Costlier Mobile  : "+ maxPricedMobile);
        Mobile minPricedMobile = mobileList.stream().max((mobile1, mobile2) -> mobile1.price < mobile2.price ? 1 : -1).get();

        System.out.println("Cheaper Mobile : "+ minPricedMobile);

        long under600 = mobileList.stream().filter(mobile -> mobile.price < 600).count();
        System.out.println("Number of mobiles under $600 is "+ under600);


        Set<String> cheaperBrands = mobileList.stream().filter(mobile -> mobile.price < 600).map(mobile -> mobile.brand).collect(Collectors.toSet());
        System.out.println("Cheaper brands are..."+ cheaperBrands);


        Map<String, String> brandNameMap = mobileList.stream().collect(Collectors.toMap(mobile -> mobile.brand, mobile -> mobile.model));
        System.out.println("------------------------------------------");
        brandNameMap.forEach((key, value) -> System.out.println("Brand :"+ key +" has model "+ value));
        System.out.println("------------------------------------------");
        System.out.println("Mapped info of brands and its model are..."+ brandNameMap);
        System.out.println("------------------------------------------");

        //Using method reference
        List<Float> mobilePriceList = mobileList.stream().filter(mobile -> mobile.price > 600).map(Mobile::getPrice).collect(Collectors.toList());
        System.out.println(mobilePriceList);



        List<String> list = Arrays.asList("10", "6.6", "9.12", "15");
        Double value = list.stream().mapToDouble(number -> Double.parseDouble(number)).reduce(0, Double::sum);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfIntegers = numbers.stream().filter(n -> n%2 == 0).mapToInt(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sumOfIntegers);





    }
}
