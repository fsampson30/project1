package com.sampson.project1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Primary
    public Person person() {
        return new Person("Fernanda",12, address());
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name,age, address2);
    }

    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("address3Qualifier") Address address3) {
        return new Person(name,age, address3);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("A Street, number 1, ","HillValley");
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("A Street, number 1, ","Springfield");
    }

}
