package com.ioc.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 切面类
 *
 */
@Aspect
public class MyAspectAnno {

    @Before(value = "execution(* com.ioc.demo.aop.ProductDao.*(..))")
    public void before(){
        System.out.println("前置通知=========");
    }
}
