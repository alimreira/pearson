package com.example.pearsonFive.configuring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PojoConfig1 {

    @Bean
    public Pojo2 pojo2 () {
        Pojo2 pjj2 = new Pojo2(12,"Ann","Student");
        return pjj2;
    }
    @Bean
    public Pojo1 pojo1 () {
        Pojo1 pjj = new Pojo1(34.5f,"cheap");
        pjj.setPojo2(pojo2());
        return pjj;
    }
}
