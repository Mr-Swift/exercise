package com.apple.developer.rectangle02;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double getArea() {
        return this.length * this.width;
    }

    private double getPer() {
        return 2 * (this.length + this.width);
    }

    protected void showAll() {
        System.out.println("length:" + this.length + "\twidth:" + width + "\tarea" + this.getArea() + "\tper:" + this.getPer());
    }
}
