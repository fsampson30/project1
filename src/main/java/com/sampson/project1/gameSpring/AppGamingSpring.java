package com.sampson.project1.gameSpring;

import com.sampson.project1.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpring {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        context.getBean(GameRunner.class).run();


    }
}
