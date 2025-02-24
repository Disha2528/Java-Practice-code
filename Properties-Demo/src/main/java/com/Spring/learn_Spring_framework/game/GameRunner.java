package com.Spring.learn_Spring_framework.game;

public class GameRunner {
    private GamingConsole game;

    public GamingConsole getGame() {
        return game;
    }

    public void setGame(GamingConsole game) {
        this.game = game;
    }

    public GameRunner(GamingConsole game){
        this.game= game;
    }

    public void run(){
        game.down();
        game.left();
        game.up();
        game.right();
    }
}
