package com.ioc.demo.demo2;

public class Bean2Factory {
    public static Bean2 createBean2(){
        System.out.println("beanfactory has creating ");
        return new Bean2();
    }
}
