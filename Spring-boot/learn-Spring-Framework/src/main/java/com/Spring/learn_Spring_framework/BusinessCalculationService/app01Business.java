package com.Spring.learn_Spring_framework.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan
public class app01Business {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(app01Business.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());


    }
}
