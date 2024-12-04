package com.example.pearsonFive.makingBeans;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
@Component
public class DoubleInstances implements DoubleProvider{
    private LocalTime ts = LocalTime.now();

    public DoubleInstances() {
        System.out.println("doubleInstances bean is created " + ts);
    }

    @Override
    public int costOfProduction(int item, int quantity) {
        return 0;
    }

    @Override
    public int pricePerUnit(int salesPrice) {
        return 0;
    }

    @Override
    public void targetAudience(String audience) {

    }

    @Override
    public String toString() {
        return "DoubleInstances{" +
                "ts=" + ts +
                '}';
    }
}
