package com.proartz.Chapter2.Exercise5;

public class Point {

    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return (new Point(this.x + x, this.y + y));
    }

    public Point scale(double ratio) {
        return (new Point(x * ratio, y * ratio));
    }
}
