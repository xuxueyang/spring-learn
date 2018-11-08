package com.ioc.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 *
 */
@Aspect
public class MyAspectAnno {

    @Before(value = "execution(* com.ioc.demo.aop.ProductDao.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知=========");
    }

    @AfterReturning(value = "execution(* com.ioc.demo.aop.ProductDao.*(..))",returning = "result")
    public void afterReturning(Object result){
        //后置通知
    }
    //around方法返回值就是目标代理方法执行的返回值
    //ProceedingJoinPoint可以调用拦截目标方法执行
    @Around(value = "execution(* com.ioc.demo.aop.ProductDao.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("--环绕前置通知--");
        Object object = joinPoint.proceed();
        //后置
        return object;
    }

//    @AfterThrowing 通过设置throwing属性

//    @After 最后通知
    @Pointcut(value ="execution(* com.ioc.demo.aop.ProductDao.delete(..))")
    private void myPointCut(){
        //通过这种方法。就阔以上面的切面注解的value写成myPointCut()
    }
}
