package com.example.stspringseri.fwk.filter.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAdvice {

    @Before("PointCutList.allController()")
    public void before(JoinPoint jp) {
        System.out.println("Before");

    }

    @After("PointCutList.allController()")
    public void after(JoinPoint jp) {
        System.out.println("After");
    }


    @Around("PointCutList.allController()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around Before");
        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable e) {
            System.out.println("Around Error Occurred" + e);
            throw e;
        }
        System.out.println("Around After");

        return result;
    }
}
