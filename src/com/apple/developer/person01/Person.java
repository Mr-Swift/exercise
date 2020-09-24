package com.apple.developer.person01;

public class Person {
    private String name;
    private double height;
    private double weight;

    protected Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    protected String getName() {
        return name;
    }

    protected void sayHello() {
        System.out.println("hello,my name is " + this.getName());
    }
}
