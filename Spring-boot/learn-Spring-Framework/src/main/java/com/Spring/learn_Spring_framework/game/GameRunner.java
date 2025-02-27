package com.Spring.learn_Spring_framework.game;

public class GameRunner {
    //loose coupling because u r not specifying a specific game here or else you would have to again and again change the game object for different game execution, here you can just pass a child object while initializing since gaming console accepts all of its child objects .

    private GamingConsole game;

    public GamingConsole getGame() {
        return game;
    }

    public void setGame(GamingConsole game) {
        this.game = game;
    }

    //constructor
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
