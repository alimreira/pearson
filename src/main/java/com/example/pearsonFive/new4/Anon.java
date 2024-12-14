package com.example.pearsonFive.new4;

import com.example.pearsonFive.anonymous.Meal;
import com.example.pearsonFive.anonymous.Person;

public class Anon {

    public static void main(String[] args) {
        Person ps = () -> {return  "Female";};
        String result = ps.gender();
        System.out.println(result);


        Meal ml = (x, y) -> {
            System.out.println(x *y);
        };
        ml.eat(12000,10);
    }
    }

