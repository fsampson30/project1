package com.sampson.project1.gameSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YourBusinessClass {
    //@Autowired
    Dependency1 dependency1;
    //@Autowired
    Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection - setDependency1");
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - setDependency1");
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }


}
