package com.example.pearsonFive.java8Optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class OptionalDemo {


    public static void main(String[] args) {
        Optional<String> st = Optional.empty();
        System.out.println(st);


        int num = 234;
        Integer test = null;
        Optional<Integer> inn = Optional.of(num);
        System.out.println(inn);

        String location = "Port-Harcourt";
        String stTest = null;
        Optional<String> st1 = Optional.ofNullable(stTest);
        System.out.println(st1);

        Optional<String> w = Optional.of(location);
        System.out.println(w);
        String fetch = w.get();


        //Optional.of(T value) is explicitly designed to throw a NullPointerException if the provided argument is null
//        Integer coin =null;
//        Optional<Integer> c = Optional.of(coin);
//        System.out.println(c);

        //Extracting values from the optional objects using the instance methods of the optional class
        boolean ln = st.isPresent();
        if(st.isPresent()){
            System.out.println(st.get());
        }
        System.out.println(ln);

        inn.ifPresent((x) -> System.out.println(x + " is done"));

        String r = st.orElse("No values available");
        System.out.println(r);

        int n = inn.orElse(403);
        System.out.println(n);

//        String rg = st.orElseThrow(() -> new IllegalArgumentException());
//        System.out.println(rg);

        int rg1 = inn.orElseThrow(()->new RuntimeException());
        System.out.println(rg1);

        String rg2 = st.orElseGet(()-> " It's empty");
        System.out.println(rg2);

        Optional<Integer> op = w.filter((x)-> x.startsWith("Por")).map((x)->x.length());
        System.out.println(op);

        System.out.println(st1.get());



    }
}
