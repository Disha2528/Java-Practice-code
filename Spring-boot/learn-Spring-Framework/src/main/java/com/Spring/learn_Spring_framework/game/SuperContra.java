package com.Spring.learn_Spring_framework.game;

public class SuperContra implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("duck");
    }

    @Override
    public void left() {
        System.out.println("Back");
    }

    @Override
    public void right() {
        System.out.println("Shoot");
    }
}
