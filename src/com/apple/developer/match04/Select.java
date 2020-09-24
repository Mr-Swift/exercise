package com.apple.developer.match04;

import java.util.Arrays;
import java.util.Random;


public class Select {
    private int num[] = new int[10];

    public Random ran = new Random();

    public Select() {
        for (int i = 0; i < num.length; i++) {
            int r;
            do {
                r = ran.nextInt(1001);
            } while (r % 3 != 0);
            this.num[i] = r;
        }
    }

    private void sort() {
        Arrays.sort(this.num);
    }

    public void print() {
        this.sort();
        System.out.println("幸运号生产如下：");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + "\t");
        }
    }
}
