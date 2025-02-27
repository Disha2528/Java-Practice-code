package com.Spring.learn_Spring_framework.game;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        GamingConsole game1= new MarioGame();

        GameRunner game= new GameRunner(game1);
        game.run();

    }
}
Exception