package com.proartz.Chapter4.Exercise1;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
}
