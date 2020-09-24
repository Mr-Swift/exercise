package com.apple.developer.person01;

public class PersonCreate {
    public static void main(String[] args) {
        Person person[] = new Person[2];
        person[0] = new Person("zhangsan", 1.73, 133);
        person[1] = new Person("lisi", 1.74, 144);
        person[0].sayHello();
        person[1].sayHello();
    }
}
