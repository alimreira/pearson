package com.example.pearsonFive.test;

public class PepperMix {
    private int tomatoes;
    private int chilliPepper;
    private int scotchBonnet;

    JollofRice jf = new JollofRice(12,7L,"italian",new PepperMix(12,20,20),
            new SpiceAndSeasoning(5,4,3,4));

    public PepperMix(int tomatoes, int chilliPepper, int scotchBonnet) {
        this.tomatoes = tomatoes;
        this.chilliPepper = chilliPepper;
        this.scotchBonnet = scotchBonnet;
    }

    public PepperMix() {
    }

    public JollofRice jollofRice () {
        return jf;
    }
}
