package com.example.pearsonFive.anonymous.predefined;

import java.util.function.Predicate;

public class Predict {

    public static void main(String[] args) {
        Predicate<String> st = (c)-> {return c.startsWith("St");};
        System.out.println(st.test("Story"));

//        Predicate<String> st1 = String::startsWith;
//        System.out.println(st.test("Story"));
    }
}
