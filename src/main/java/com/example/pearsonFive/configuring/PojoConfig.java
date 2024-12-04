package com.example.pearsonFive.configuring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class PojoConfig {

    @Bean
    public Pojo1 pojo1a () {
        Pojo1 pj = new Pojo1(230,"Local");
        return pj;
    }

    @Bean(name = "ben")
    Pojo1 pojo1b () {
        Pojo1 pj = new Pojo1(450,"foreign");
        return pj;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Pojo2 pojo2a () {
        Pojo2 pj = new Pojo2(50, "male", "tutor");
        return pj;
    }

    @Bean
    @Lazy
    Pojo2 pojo2b () {
        Pojo2 pj2 = new Pojo2(39, "female", "dancer");
        return pj2;
    }
}
