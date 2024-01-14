package com.murali;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects {
    @Before("execution(* com.murali.Original.display())")
    public void beforeExec(){
        System.out.println("called before org display");
    }
}
