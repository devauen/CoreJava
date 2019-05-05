package com.proartz.Chapter4.Exercise4;

import com.proartz.Chapter4.Exercise1.Point;

public abstract class Shape {

    Point position;

    public Shape() {
    }

    public Shape(Point position) {
        this.position = position;
    }

    public void moveBy(double dx, double dy) {
        position.setX(position.getX() + dx);
        position.setY(position.getY() + dy);
    }

    public abstract Point getCenter();

}
