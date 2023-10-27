package com.sampson.project1.cdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class CdiLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(CdiLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(BusinessService.class).getDataService());
    }
}
