package com.apple.developer.system06;

import java.util.Scanner;

public class StudentManager {
    private Student[] students = new Student[30];

    public Scanner in = new Scanner(System.in);

    protected void initial() {
        students[0] = new Student("001", "jack", "南京");
        students[1] = new Student("002", "ming", "北京");
        students[2] = new Student("003", "jun", "Tokyo");
    }

    protected void showMenu() {
        initial();
        do {
            System.out.println("\n\n******************");
            System.out.println("欢迎来到学生管理系统！");
            System.out.println("1、添加学生信息\n2、修改学生信息\n3、显示所有学生信息\n4、退出");
            System.out.println("******************");
            System.out.print("请输入您的选择:");
            int choice = in.nextInt();

            switch (choice) {
                case 4:
                    System.exit(0);
                case 1:
                    addStudent();
                    break;
                case 2:
                    modifyStudent();
                    break;
                case 3:
                    searchAll();
                    break;
                default:
                    break;
            }
        } while (true);
    }

    private void searchAll() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s.getInfo());
            } else {
                break;
            }
        }
        returnMenu();
        return;
    }

    private void modifyStudent() {
        System.out.print("请输入学生学号：");
        String no = in.next();
        Student stu = findByNo(no);
        if (stu == null) {
            System.out.println("该学生不存在，请核对后输入！");
        }
        if (stu != null) {
            int index = findIndexByNo(no);
            do {
                System.out.println("1、修改学号\n2、修改姓名\n3、修改地址\n4、退出");
                System.out.print("请选择：");
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.print("请输入修改后的学号：");
                    String newNo = in.next();
                    students[index].setStuNo(newNo);
                }
                if (choice == 2) {
                    System.out.print("请输入修改后的姓名：");
                    String newName = in.next();
                    students[index].setStuName(newName);
                }
                if (choice == 3) {
                    System.out.print("请输入修改后的地址：");
                    String newAddress = in.next();
                    students[index].setStuAddress(newAddress);
                }
                if (choice == 4) {
                    break;
                }
            } while (true);
            returnMenu();
            return;
        }

    }

    private void addStudent() {
        System.out.print("请输入学生学号：");
        String no = in.next();
        Student stu = findByNo(no);
        if (stu != null) {
            System.out.println("该学生已经存在，无法录入！");
            return;
        }
        if (stu == null) {
            System.out.print("请输入学生姓名：");
            String name = in.next();
            System.out.print("请输入学生地址：");
            String address = in.next();
            int index = findTheIndex();
            Student theNew = new Student(no, name, address);
            students[index] = theNew;
            System.out.println("增添完毕！");
            returnMenu();
            return;
        }
    }

    private Student findByNo(String no) {
        Student stu = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getStuNo().equals(no)) {
                    stu = students[i];
                    break;
                }
            }
        }
        return stu;
    }

    private int findIndexByNo(String no) {
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getStuNo().equals(no)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    private int findTheIndex() {
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                index++;
            }
        }
        return index;
    }

    private void returnMenu() {
        System.out.print("请输入任意数字返回：");
        int num = in.nextInt();
        return;
    }
}




