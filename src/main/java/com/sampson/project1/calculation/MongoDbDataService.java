package com.sampson.project1.calculation;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] {11,22,33,44,55};
    }
}
