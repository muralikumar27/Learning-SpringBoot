package com.murali;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdditionAspect {
    @Before("execution(int com.murali.Addition.add(..))")
    public void addAspect(JoinPoint jp){
        String str = jp.getArgs()[0].toString();
        System.out.println(str);
    }
    @Pointcut("execution(int com.murali.Addition.add(..))")
    public void additionPointCut(){

    }
    @AfterReturning(pointcut = "additionPointCut()",returning = "x")
    public void AfterReturnAspect(int x){
        System.out.println("Added value :" + x);
    }
}
