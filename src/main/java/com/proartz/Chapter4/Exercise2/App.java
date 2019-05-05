package com.proartz.Chapter4.Exercise2;

public class App {

    public static void main(String[] args) {

        LabeledPoint point1 = new LabeledPoint(10, 20, "Maximum");
        LabeledPoint point2 = new LabeledPoint(10, 20, "Maximum");
        LabeledPoint point3 = new LabeledPoint(15, 35, "Minimum");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println("point1.equals(point2)=" + point1.equals(point2));
        System.out.println("point1.equals(point3)=" + point1.equals(point3));
        System.out.println("point1.hashCode()=" + point1.hashCode());
        System.out.println("point2.hashCode()=" + point2.hashCode());
        System.out.println("point3.hashCode()=" + point3.hashCode());

    }

}
