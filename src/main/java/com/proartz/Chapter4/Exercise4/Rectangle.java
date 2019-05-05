package com.proartz.Chapter4.Exercise4;

import com.proartz.Chapter4.Exercise1.Point;

public class Rectangle extends Shape {

    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        double x = topLeft.getX() + (0.5 * width);
        double y = topLeft.getY() + (0.5 * height);

        return new Point(x, y);
    }
}
