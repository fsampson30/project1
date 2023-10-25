package com.sampson.project1.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Initializing classA");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Doing Something");
    }
}
