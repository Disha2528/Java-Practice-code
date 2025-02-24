package com.Spring.learn_Spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Spring.learn_Spring_framework.game")
public class App03GamingSpringBeans {


    @Bean
    public GameRunner gameRunner(GamingConsole game){
        System.out.println("Parameter"+ game);
        var gameRunner= new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);

        context.getBean(GamingConsole.class).up();



    }
}
