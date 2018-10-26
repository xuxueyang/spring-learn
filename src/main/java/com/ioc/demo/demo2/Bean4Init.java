package com.ioc.demo.demo2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean4Init implements BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean {
    @Override
    public void setBeanName(String name) {
        //第一步实例化
        //第二部设置值
        //spring初始化第三步，设置bean的名称
        System.out.println(name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //第四部了解实例化工厂信息
    }
    //第五步：BeanPostProcessor,执行postProcessBeforeInitialization
    @Override
    public void afterPropertiesSet() throws Exception {
        //6: 属性被设置后
    }
    //7：指定的init-method方法

    public void run(){
        //9：执行自己的方法
    }

    @Override
    public void destroy() throws Exception {
        //10: 执行销毁方法
    }
    //11:执行destory-method的方法
}
