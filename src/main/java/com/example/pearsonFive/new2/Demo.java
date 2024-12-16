//package com.example.pearsonFive.new2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Demo {
//
//    //Stream as a source
//    Stream<String> st = Stream.of("first","next","fourth","second");
//        st.forEach(System.out::print);
//
//        System.out.println();
//    Stream<Integer> inn = Stream.of(12,89,77,45,34,2);
//        inn.forEach((c)-> {
//        if(c%2 == 0){
//            System.out.println(c);
//        }
//    });
//
//    //Collection as stream api source
//    List<String> str = new ArrayList<>();
//        str.add("Morning");
//        str.add("Dawn");
//        str.add("Daylight");
//        str.add("Bright");
//    List<String> res = str.stream().sorted((x,y) -> {
//        return x.compareTo(y);
//    }).collect(Collectors.toList());
//        System.out.println(res);
//
//    //Array as Stream api source
//        Arrays.stream(new int[] {12,89,19,45,34,21,90}).filter((x) -> x > 30).forEach((x) -> System.out.println(x));
//}
