package com.example.pearsonFive.restImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRest {

    @RequestMapping("/eat")
    public void orderMeal (String meal ,int cost){
        System.out.println();
    }


}
