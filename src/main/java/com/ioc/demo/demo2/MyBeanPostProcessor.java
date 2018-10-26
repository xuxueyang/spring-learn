package com.ioc.demo.demo2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor{
    @Nullable
    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("第八步 初始化后方法...\n");
        if("userDao".equals(beanName)){
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    //面向切面编程，增强方法
                    if("save".equals(method.getName())){
                        //如果是保存，那么增加权限校验
                        System.out.println("权限校验===========");
                        method.invoke(bean,args);
                    }
                    return null;
                }
            });
            return proxy;
        }
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步 初始化前方法...\n");
        return bean;
    }
}
