package com.Spring.learn_Spring_framework.HelloWorld;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    record Person(String Name, int Age, Address address){ }
    record Address (String FirstLine, String City){}



    //Creating Bean
    @Bean
    public String name(){
        return "Disha";
    }

    @Bean
    public int Age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Disha",23, address());
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), Age(),address());
    }

    @Bean(name="MyAddress")
    public Address address(){
        return new Address("Andheri", "Mumbai");
    }

    @Bean
    public Person person3Parameters(String name, int age, Address MyAddress){
        return new Person(name, age, MyAddress);
    }




}
