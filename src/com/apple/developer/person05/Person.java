package com.apple.developer.person05;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    protected String getInfo() {
        return "姓名：" + this.getName() + "\t年龄：" + this.getAge() + "\t性别：" + this.getSex();
    }
}
