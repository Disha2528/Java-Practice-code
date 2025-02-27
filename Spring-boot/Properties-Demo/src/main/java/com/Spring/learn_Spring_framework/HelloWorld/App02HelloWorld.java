package com.Spring.learn_Spring_framework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {
    public static void main(String[] args) {
        //1: Launching Spring Context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: Configure things we want spring to manage
        //HelloWorldConfiguration - Configuration
        //name- @Bean

        //3: Retrieveing the Bean

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("Age"));
        System.out.println(context.getBean("MyAddress"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));

    }



}
