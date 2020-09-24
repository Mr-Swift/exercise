package com.apple.developer.point03;

import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point p[] = new Point[2];

        System.out.print("请输入p1的横坐标:");
        double x0 = in.nextDouble();
        System.out.print("请输入p1的纵坐标:");
        double y0 = in.nextDouble();
        p[0] = new Point(x0, y0);

        System.out.print("请输入p2的横坐标:");
        double x1 = in.nextDouble();
        System.out.print("请输入p2的纵坐标:");
        double y1 = in.nextDouble();
        p[1] = new Point(x1, y1);

        System.out.println("p1的坐标为(" + p[0].getX() + "," + p[0].getY() + ")");
        System.out.println("p2的坐标为(" + p[1].getX() + "," + p[1].getY() + ")");

        System.out.print("请输入p1点移动后的横坐标：");
        x0 = in.nextDouble();
        System.out.print("请输入p1点移动后的纵坐标：");
        y0 = in.nextDouble();

        p[0].movePoint(x0, y0);

        System.out.print("请输入p2点移动后的横坐标：");
        x1 = in.nextDouble();
        System.out.print("请输入p2点移动后的纵坐标：");
        y1 = in.nextDouble();

        p[1].movePoint(x1, y1);

        System.out.println("移动后p1的坐标为(" + p[0].getX() + "," + p[0].getY() + ")");
        System.out.println("移动后p2的坐标为(" + p[1].getX() + "," + p[1].getY() + ")");
    }
}
