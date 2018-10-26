package com.ioc.demo.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo4 {
    @Test
    public void demo2(){
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAnnotation.xml");
        //通过工厂获得类
        UserServiceAnnotation userService = (UserServiceAnnotation)applicationContext.getBean("userServiceAnnotation");
        System.out.println(userService.sayHello("xxy"));
        System.out.println(userService.eat());
        userService.save();
    }
}
