package com.sampson.project1.gameSpring;

import com.sampson.project1.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan//("com.sampson.project1.gameSpring")
public class GamingAppLauncherApplication {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

        //context.getBean(GameRunner.class).run();

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
