package com.sampson.project1.gameSpring;

import com.sampson.project1.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sampson.project1.game")
public class AppGamingSpring {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(AppGamingSpring.class);

        context.getBean(GameRunner.class).run();


    }
}
