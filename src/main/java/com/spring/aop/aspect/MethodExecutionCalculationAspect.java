package com.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger loger = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

    //@Around - uses an around advice. It intercepts the method call and uses joinPoint.proceed() to execute the method.
    //@annotation - is the pointcut to define interception based on annotation
                    //@annotation followed by complete type name of the annotation
    @Around("@annotation(com.spring.aop.util.TrackTime)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{

        long startTime = System.currentTimeMillis();
        joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;
        loger.info("Time taken by {} ", joinPoint.getSignature().getName(), timeTaken);
    }


}
