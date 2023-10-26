package com.sampson.project1.prepost;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All Dependencies are ready!");
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }
}

