package com.ioc.demo.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCglibProxy  implements MethodInterceptor{

    private Object object;
    public MyCglibProxy(Object object){
        this.object = object;
    }
    public Object createProxy(){
        //1.创建一个CGLIB的核心类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(this.object.getClass());
        //3.设置回调
        enhancer.setCallback(this);
        //4.生成代理
        Object proxy = enhancer.create();
        return proxy;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if("update".equals(method.getName())){
            System.out.println("--------权限校验");
            return methodProxy.invokeSuper(method,objects);
        }
        return methodProxy.invokeSuper(method,objects);
    }
}
