package com.sampson.project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {} ;
record Address(String firstLine, String city) {} ;
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Flavio";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Fernanda",12, adress());
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(), adress());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name,age, address2);
    }

    @Bean(name = "address2")
    public Address adress() {
        return new Address("A Street, number 1, ","HillValley");
    }

}
