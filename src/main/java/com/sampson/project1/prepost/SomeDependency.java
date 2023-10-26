package com.sampson.project1.prepost;

import org.springframework.stereotype.Component;

@Component
public class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency");

    }
}
