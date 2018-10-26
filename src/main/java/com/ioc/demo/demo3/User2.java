package com.ioc.demo.demo3;

public class User2 {
    private String name;
    private String age;
    private Cat cat;

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cat=" + cat +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
