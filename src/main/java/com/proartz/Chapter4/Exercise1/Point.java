package com.proartz.Chapter4.Exercise1;

import java.util.Objects;

public class Point {

    protected double x;
    protected double y;

    public Point(){
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
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
