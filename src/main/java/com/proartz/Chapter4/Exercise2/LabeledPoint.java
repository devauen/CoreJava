package com.proartz.Chapter4.Exercise2;

import com.proartz.Chapter4.Exercise1.Point;

import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public String toString() {
        return super.toString() +
                "[label=" + getLabel() + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)) return false;
        LabeledPoint other = (LabeledPoint) otherObject;
        return label.equals(other.label);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(label);
    }
}
