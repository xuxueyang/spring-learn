package com.ioc.demo.demo2;


/**
 * 实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("bean3factory has creating");
        return new Bean3();
    }
}
