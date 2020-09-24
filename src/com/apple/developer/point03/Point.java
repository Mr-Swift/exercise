package com.apple.developer.point03;

public class Point {
    private double x;
    private double y;

    public Point(double x0, double y0) {
        this.x = x0;
        this.y = y0;
    }

    public Point() {

    }

    public void movePoint(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
