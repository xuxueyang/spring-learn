package com.ioc.demo.demo1;

public class UserServiceImpl implements UserService {
    private String name;
    @Override
    public void sayHello() {
        System.out.println("hello world"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
