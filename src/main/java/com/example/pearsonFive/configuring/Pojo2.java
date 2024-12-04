package com.example.pearsonFive.configuring;

public class Pojo2 {
    private int age;
    private String name;
    private String profession;

    public Pojo2(int age, String name, String profession) {
        this.age = age;
        this.name = name;
        this.profession = profession;
        System.out.println("pojo2 bean is made " + age + " " + " " + name + " " + profession);
    }


}
