package com.apple.developer.rectangle02;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input the length of the rectangle:");
        double length = in.nextDouble();

        System.out.print("Please input the width of the rectangle:");
        double width = in.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.showAll();
    }
}
