package com.proartz.Chapter4.Exercise1;

import java.util.Objects;

public class Point {

    private double x;
    private double y;

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

    @Override
    public String toString() {
        return getClass().getName() +
                "[x=" + getX() +
                ",y=" + getY() + "]";
    }

    @Override
    public boolean equals(Object otherObj) {
        if(this == otherObj) return true;
        if(otherObj == null) return false;
        if(getClass() != otherObj.getClass()) return false;
        Point other = (Point) otherObj;
        return x == other.x &&
                y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
