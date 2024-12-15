package com.example.pearsonFive.anonymous.predefined;

import java.util.function.Consumer;

public class Consumers {


    public static void main(String[] args) {
        Consumer<String>  st = (x) -> {
            System.out.println(x.toUpperCase());};
        st.accept("lagosian");

//        Consumer<String>  st1 = x::toUpperCase;
//        st.accept("lagosian");
    }
}
