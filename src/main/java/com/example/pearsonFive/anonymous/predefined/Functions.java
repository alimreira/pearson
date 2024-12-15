package com.example.pearsonFive.anonymous.predefined;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<Integer,Double> funct = (a) -> {
            return Math.sqrt(a);
        };
        Double db = funct.apply(24 );
        System.out.println(db);

        Function<Integer,Double> funct1 = Math::sqrt;
        Double db1 = funct.apply(24 );
        System.out.println(db);
    }


}
