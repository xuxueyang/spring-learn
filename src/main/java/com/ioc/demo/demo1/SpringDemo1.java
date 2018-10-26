package com.ioc.demo.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDemo1 {
    @Test
    public void demo1(){
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }
    @Test
    public void demo2(){
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService)applicationContext.getBean("demo1");
        userService.sayHello();
    }
    @Test
    public void demo3(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("c:\\applicationContext.xml");
        //DO
    }
    @Test
    /**
     * 传统方式的工厂类
     */
    public void demo4(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        UserService userService = (UserService)beanFactory.getBean("demo1");
        userService.sayHello();
    }
}
