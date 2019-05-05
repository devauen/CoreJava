package com.proartz.Chapter4.Exercise5;

import com.proartz.Chapter4.Exercise1.Point;

public class Line extends Shape implements Cloneable{

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

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
