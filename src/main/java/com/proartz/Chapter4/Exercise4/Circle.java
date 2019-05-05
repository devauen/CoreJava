package com.proartz.Chapter4.Exercise4;

import com.proartz.Chapter4.Exercise1.Point;

public class Circle extends Shape {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return center;
    }
}

