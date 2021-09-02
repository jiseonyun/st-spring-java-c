package com.example.stspringseri.fwk.filter.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutList {

    @Pointcut("execution(* com.example.stspringseri..controller..*.*(..))")
    public void allController() {
    }
}
