package com.example.pearsonFive.makingBeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Primary
public class DoubleInstances1 implements DoubleProvider{

    private LocalTime  lt = LocalTime.now();

    public DoubleInstances1() {
        System.out.println("doubleInstances1 bean is created " + lt);
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
        return "DoubleInstances1{" +
                "lt=" + lt +
                '}';
    }
}
