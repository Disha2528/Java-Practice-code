package com.Spring.learn_Spring_framework.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Arrays;
@Component
public class BusinessCalculationService {

    DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService){
        this.dataService=dataService;
    }


    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
