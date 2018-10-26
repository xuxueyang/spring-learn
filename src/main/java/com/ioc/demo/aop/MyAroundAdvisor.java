package com.ioc.demo.aop;

import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class MyAroundAdvisor implements org.aopalliance.intercept.MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //环绕前增强
        Object proceed = methodInvocation.proceed();
        //环绕后增强
        return proceed;
    }
}
