package com.example.pearsonFive.anonymous.bi;

import java.util.function.BiPredicate;

public class BiPredict {

    public static void main(String[] args) {
        BiPredicate<String,String> bi = (x,y) -> {return x.startsWith(y);};
        System.out.println(bi.test("Yesterday","Yes"));
    }
}
