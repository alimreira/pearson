package com.example.pearsonFive.looseCoupling;

public class Str {
    private String person;

    public Str(String person) {
        this.person = person;
    }

    public static void main(String[] args) {
        Str tr = new Str("FEMALE");
        String test = tr.person.toLowerCase();
        System.out.println(test);

    }
}
