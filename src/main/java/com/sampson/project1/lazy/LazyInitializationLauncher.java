package com.sampson.project1.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class LazyInitializationLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(LazyInitializationLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("Initialization of context is completed.");

        context.getBean(ClassB.class).doSomething();
    }
}
