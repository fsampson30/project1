package com.sampson.project1.gameSpring;

import com.sampson.project1.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }


    /*var marioGame = new MarioGame();
    var superContraGame = new SuperContraGame();
    var p
    var gameRunner = new GameRunner(pacman);
        gameRunner.run();*/

}
