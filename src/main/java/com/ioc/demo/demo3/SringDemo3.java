package com.ioc.demo.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SringDemo3 {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user.toString());
    }
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 user = (User2)applicationContext.getBean("user2");
        System.out.println(user.toString());
    }
    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean user = (CollectionBean)applicationContext.getBean("collectionBean");
        System.out.println(user.toString());
    }
}
