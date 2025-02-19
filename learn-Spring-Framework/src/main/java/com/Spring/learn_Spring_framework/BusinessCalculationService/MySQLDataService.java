package com.Spring.learn_Spring_framework.BusinessCalculationService;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
@Component
public class MySQLDataService implements DataService {
    public int[] retrieveData(){
        return new int[] {1,2,3,4,5};
    }
}
