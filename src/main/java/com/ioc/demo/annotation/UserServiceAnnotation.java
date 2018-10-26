package com.ioc.demo.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component("userServiceAnnotation")
public class UserServiceAnnotation {

//    @Autowired
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    @Value("米饭")
    private String something;

    public String sayHello(String name){
        return "hello" + name;
    }
    public String eat(){
        return "eat:" + something;
    }
    public void save(){
        userDao.save();
    }
    @PostConstruct
    public void init(){}

}
