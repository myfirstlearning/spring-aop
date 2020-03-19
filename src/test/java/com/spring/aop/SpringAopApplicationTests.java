package com.spring.aop;

import com.spring.aop.service.Business1;
import com.spring.aop.service.Business2;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringAopApplicationTests {

    private Logger logger = LoggerFactory.getLogger(SpringAopApplicationTests.class);

    @Autowired
    private Business1 business1;

    @Autowired
    private Business2 business2;

    @Test
    public void invokeAOPStuff(){

        logger.info(business1.calculateSsomething());
        logger.info(business2.calculateSomething());

    }

}
