package com.sampson.project1;

import com.sampson.project1.game.GameRunner;
import com.sampson.project1.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args){

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
