package com.example.pearsonFive.configuring;

public class Pojo1 {
    private float cost;
    private String typeOfMeal;

    private Pojo2 pojo2;

    public void setPojo2(Pojo2 pojo2) {
        this.pojo2 = pojo2;
    }

    public Pojo1(float cost, String typeOfMeal) {
        this.cost = cost;
        this.typeOfMeal = typeOfMeal;
        System.out.println("pojo1 is made " + cost + " " + typeOfMeal);
    }
}
