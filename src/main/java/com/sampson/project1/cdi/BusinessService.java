package com.sampson.project1.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}
