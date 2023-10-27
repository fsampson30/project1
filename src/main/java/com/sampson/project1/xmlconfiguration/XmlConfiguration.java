package com.sampson.project1.xmlconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class XmlConfiguration {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(XmlConfiguration.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
