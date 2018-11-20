package com.mybatis.demo;

import org.apache.ibatis.plugin.*;
import sun.plugin2.main.server.ResultHandler;

import java.sql.Statement;
import java.util.Properties;

/**
 * 插件签名，告诉mybatis单线插件用来拦截那个对象的哪个方法
 */
@Intercepts({
        @Signature(type = ResultHandler.class,method = "handleResultSets",args = Statement.class)

})
public class MyFirstInterceptor implements Interceptor {
    //拦截目标方法
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
//        invocation.getTarget()
        return invocation.proceed();
    }

    //包装目标对象 为代理对象创建代理对象
    @Override
    public Object plugin(Object o) {
        return  Plugin.wrap(o,this);
    }

    @Override
    public void setProperties(Properties properties) {
        System.out.println("插件配置参数"+properties);
    }
}
