package com.ioc.demo.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("MyBeforeAdvisor")
public class MyBeforeAdvisor implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        System.out.println("前置增强==========");
    }
}
