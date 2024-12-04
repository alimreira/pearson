package com.example.pearsonFive.makingBeans;

import org.apache.logging.log4j.Logger;
import org.apache.logging.slf4j.SLF4JLogger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalTime;

@Component
public class SingleInstances implements SingleProvider{
    //private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    private LocalTime ts1 = LocalTime.now();

    private DoubleProvider doubleProvider;

    @Autowired
    public SingleInstances(DoubleProvider doubleProvider) {
       // this.ts1 = ts1;
        this.doubleProvider = doubleProvider;
    }

    public SingleInstances() {
        System.out.println("singleInstances bean is created " + ts1);
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
        return "SingleInstances{" +
                "ts1=" + ts1 +
                '}';
    }

    @PostConstruct
    public void postConstruct () {
        //logger.info("PostConstruct");
       System.out.println("Postconstruct " + ts1);
    }

    @PreDestroy
    public void preDestory () {
        System.out.println("PreDestroy " + ts1);
    }
}
