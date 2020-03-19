package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAcceptanceAspect {


    private Logger logger = LoggerFactory.getLogger(UserAcceptanceAspect.class);

    //pointcut - defines when a call to a method should be intercepted
    //JoinPoint - a specific execution instance of an advice
    //Weaver - framework that implements the AOP - AspectJ or Spring AOP
    @Before("execution(* com.spring.aop.domain.*.*(..))")
    public void before(JoinPoint joinPoint){
        //Advice - logic you want to execute when you intercept a method
        logger.info(">>>>>>>>> Executing before domain method ");
        logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinPoint.getSignature().getName());

    }

    @After("execution(* com.spring.aop.domain.*.*(..))")
    public void after(JoinPoint joinPoint){
        //Advice - logic you want to execute when you intercept a method
        logger.info(">>>>>>>> Executing after domain method ");

    }

}
