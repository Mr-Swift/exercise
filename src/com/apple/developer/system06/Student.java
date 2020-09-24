package com.apple.developer.system06;

public class Student {
    private String stuNo;
    private String stuName;
    private String stuAddress;

    protected Student(String stuNo, String stuName, String stuAddress) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAddress = stuAddress;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public String getInfo() {
        return "学号：" + this.getStuNo() + "\t\t姓名：" + this.getStuName() + "\t\t地址：" + this.getStuAddress();
    }
}
