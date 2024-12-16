package com.example.pearsonFive.anonymous.predefined;

import java.util.function.Supplier;

public class Supplies {

    public static void main(String[] args) {
        Supplier<String> sp = () -> {return "Good morning";};
        String st = sp.get();
        System.out.println(st);

        Supplier<String> sp1 = () -> {return "Good morning";};
        String st1 = sp.get();
        System.out.println(st);
    }
}
