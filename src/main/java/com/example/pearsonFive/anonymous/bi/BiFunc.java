package com.example.pearsonFive.anonymous.bi;

import java.util.function.BiFunction;

public class BiFunc {

    public static void main(String[] args) {
        BiFunction<String,String,Integer> bi = (x,y) -> {return x.compareToIgnoreCase(y);};
        System.out.println(bi.apply("Jump","Jump"));
    }
}
