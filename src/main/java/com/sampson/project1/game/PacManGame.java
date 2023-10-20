package com.sampson.project1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacmanGame")
public class PacManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Up in the maze");
    }

    @Override
    public void down() {
        System.out.println("Down in the maze");

    }

    @Override
    public void left() {
        System.out.println("Left in the maze");

    }

    @Override
    public void right() {
        System.out.println("Right in the maze");

    }
}
