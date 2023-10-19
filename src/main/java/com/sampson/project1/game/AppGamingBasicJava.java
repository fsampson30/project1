package com.sampson.project1.game;

import com.sampson.project1.game.GameRunner;
import com.sampson.project1.game.MarioGame;
import com.sampson.project1.game.PacManGame;
import com.sampson.project1.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args){

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacman = new PacManGame();
        var gameRunner = new GameRunner(pacman);
        gameRunner.run();

    }
}
