package com.example.pearsonFive.makingBeans;

public interface DoubleProvider {

    public int costOfProduction (int item, int quantity);

    public int pricePerUnit (int salesPrice);

    public void targetAudience (String audience);
}
