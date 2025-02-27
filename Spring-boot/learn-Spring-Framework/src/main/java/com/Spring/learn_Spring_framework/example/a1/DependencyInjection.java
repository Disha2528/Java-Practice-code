package com.Spring.learn_Spring_framework.example.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;

    public String toString(){
        return "Using"+ dependency1+ "and" +dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DependencyInjection {

    public static void main(String[] args) {
       try(
               var context= new AnnotationConfigApplicationContext(DependencyInjection.class);
                ){
           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }





    }
}
