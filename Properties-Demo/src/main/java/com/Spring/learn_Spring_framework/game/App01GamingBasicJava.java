package com.Spring.learn_Spring_framework.game;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        GamingConsole game1 = new MarioGame();
        GamingConsole game2= new Pacman();
        GamingConsole game3= new SuperContra();

        game1.down();
        game2.down();

    }
}
