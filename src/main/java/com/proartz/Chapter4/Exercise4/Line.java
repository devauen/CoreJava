package com.proartz.Chapter4.Exercise4;

import com.proartz.Chapter4.Exercise1.Point;

public class Line extends Shape {

    Point from;
    Point to;

    public Line(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point(to.getX() - from.getX(),
                to.getY() - from.getY());
    }
}
