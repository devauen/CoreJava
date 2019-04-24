package com.proartz.Chapter2.Exercise7;

public class App {

    public static void main(String[] args) {
        Point point = new Point(3, 4);
        point.translate(1, 3);
        point.scale(0.5);

        System.out.printf("x = %.2f, y = %.2f%n", point.getX(), point.getY());
    }
}
