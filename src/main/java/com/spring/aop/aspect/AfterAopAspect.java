package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(AfterAopAspect.class);

    @AfterReturning(value = "execution(* com.spring.aop.service.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} returned with value {}", joinPoint.getSignature().getName(), result);
    }

    @After(value = "execution(* com.spring.aop.service.*.*(..))")
    public void after(JoinPoint joinPoint){
        logger.info(">>>>>> Executing after Service method ");
        logger.info("after execution of {}", joinPoint.getSignature().getName());
    }

    @Before("execution(* com.spring.aop.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info(">>>>>>> Executing Before Service method ");


    }


}
