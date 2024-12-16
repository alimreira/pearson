package com.example.pearsonFive.anonymous;

public class LambdaOne {

    public static void main(String[] args) {
        Person ps = () -> {return  "Female";};
        String result = ps.gender();
        System.out.println(result);


        Meal ml = (x,y) -> {
            System.out.println(x *y);
        };
        ml.eat(12000,10);
    }
}
