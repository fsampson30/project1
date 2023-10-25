package com.sampson.project1.lazy;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Initializing classA");
        this.classA = classA;
    }
}
