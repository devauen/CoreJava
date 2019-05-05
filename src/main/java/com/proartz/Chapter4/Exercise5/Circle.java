package com.proartz.Chapter4.Exercise5;

import com.proartz.Chapter4.Exercise1.Point;

public class Circle extends Shape implements Cloneable{

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

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException{
        return (Circle) super.clone();
    }
}

