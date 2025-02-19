package com.Spring.learn_Spring_framework.BusinessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDbDataService implements DataService{
    public int[] retrieveData(){
        return new int[] {11,22,33,44,55};
    }

}
