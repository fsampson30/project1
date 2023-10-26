package com.sampson.project1.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
