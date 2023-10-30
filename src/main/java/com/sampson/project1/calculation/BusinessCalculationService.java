package com.sampson.project1.calculation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {

    private DataService dataService;

    public BusinessCalculationService(@Qualifier("MySQLDataService") DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
