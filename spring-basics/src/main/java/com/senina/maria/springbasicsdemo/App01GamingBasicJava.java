package com.senina.maria.springbasicsdemo;

import com.senina.maria.springbasicsdemo.game.GameRunner;
import com.senina.maria.springbasicsdemo.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContreGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
