package com.apple.developer.person05;


import java.util.Random;
import java.util.Scanner;

public class GetMarried {

    private Person p[] = new Person[3];

    public Scanner in = new Scanner(System.in);
    public Random ran = new Random();

    protected void menu() {
        System.out.println("请输入第一个人的名字、年龄、性别：");
        String name0 = in.next();
        int age0 = in.nextInt();
        String sex0 = in.next();
        p[0] = new Person(name0, age0, sex0);

        System.out.println("请输入第二个人的名字、年龄、性别：");
        String name1 = in.next();
        int age1 = in.nextInt();
        String sex1 = in.next();
        p[1] = new Person(name1, age1, sex1);

        check(p[0], p[1]);
        print(p);
    }

    protected void check(Person p0, Person p1) {
        if (p0.getSex().equals(p1.getSex()) == false) {
            if ((p0.getSex().equals("男") && p0.getAge() >= 23 && p1.getSex().equals("女") && p1.getAge() >= 22) || (p0.getSex().equals("女") && p0.getAge() >= 22 && p1.getSex().equals("男") && p1.getAge() >= 23)) {
                System.out.println("达到结婚条件，准许结婚！");
                makePerson();
            }
        } else {
            System.out.println("不支持同性恋！");
        }
    }

    protected void makePerson() {
        System.out.print("请给新生儿取个名字，孩子随父亲姓：");
        String name = in.next();
        int r = ran.nextInt(2);
        String sex = null;
        if (r == 0)
            sex = "女";
        if (r == 1)
            sex = "男";
        p[2] = new Person(name, 0, sex);
    }

    protected void print(Person[] p) {
        System.out.println("一家人的信息输出：");
        for (Person a : p) {
            System.out.println(a.getInfo());
        }
    }
}
