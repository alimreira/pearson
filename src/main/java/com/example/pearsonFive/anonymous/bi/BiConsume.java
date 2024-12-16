package com.example.pearsonFive.anonymous.bi;

import java.util.function.BiConsumer;

public class BiConsume {

    public static void main(String[] args) {
        BiConsumer<Double,Integer> bi = (x,y) -> {
            System.out.println(x * y);
        };
        bi.accept(12.5,4);

    }
}
