package com.spring.aop.service;

import com.spring.aop.domain.Dao1;
import com.spring.aop.util.TrackTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    private Logger logger = LoggerFactory.getLogger(Business1.class);

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSsomething(){

        String value = dao1.retrieveSomething();
        //logger.info("In Business - {}", value);
        return value;
    }

}
