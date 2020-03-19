package com.spring.aop.service;

import com.spring.aop.domain.Dao2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    private Logger logger = LoggerFactory.getLogger(Business1.class);

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){

        //logger.info("Invoking Business2 Service");
        return dao2.retrieveSomething();
    }

}
