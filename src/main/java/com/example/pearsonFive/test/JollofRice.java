package com.example.pearsonFive.test;

public class JollofRice {

    private int riceQuantityInCups;
    private final int saltInSpoon = 1;
    private Long waterInCup;
    private String riceBrand;
    private PepperMix pepperMix;
    private SpiceAndSeasoning spiceAndSeasoning;

    public JollofRice(int riceQuantityInCups, Long waterInCup, String riceBrand, PepperMix pepperMix, SpiceAndSeasoning spiceAndSeasoning) {
        this.riceQuantityInCups = riceQuantityInCups;
        this.waterInCup = waterInCup;
        this.riceBrand = riceBrand;
        this.pepperMix = pepperMix;
        this.spiceAndSeasoning = spiceAndSeasoning;
    }


    public static void main(String[] args) {
        JollofRice jr = new JollofRice(5,2,"Thai",new PepperMix(5,8,6),new SpiceAndSeasoning(2,2,1,2));
        System.out.println(jr);
    }
}
