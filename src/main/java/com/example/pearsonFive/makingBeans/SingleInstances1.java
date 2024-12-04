package com.example.pearsonFive.makingBeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component("single")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Lazy
public class SingleInstances1 implements SingleProvider{

    private LocalTime tt = LocalTime.now();

    public SingleInstances1() {
        System.out.println("single bean is created " + tt);
    }

    @Override
    public int costOfItemPurchased(int item, int quantity) {
        return 0;
    }

    @Override
    public void purchaser(String person) {

    }

    @Override
    public String toString() {
        return "SingleInstances1{" +
                "tt=" + tt +
                '}';
    }
}
