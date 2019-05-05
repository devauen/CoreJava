package com.proartz.Chapter4.Exercise5;

import com.proartz.Chapter4.Exercise1.Point;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException{

        Circle c1 = new Circle(new Point(0, 0), 10);
        Circle c2 = c1.clone();

        c2.setCenter(new Point(10, 10));
        System.out.println("c1 center = (" + c1.getCenter() + ")");
        System.out.println("c2 center = (" + c2.getCenter() + ")");


    }

}
