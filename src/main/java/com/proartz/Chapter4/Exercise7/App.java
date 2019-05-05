package com.proartz.Chapter4.Exercise7;

public class App {

    public static void main(String[] args) {

        Color red = Color.RED;
        Color blue = Color.BLUE;
        Color white = Color.WHITE;

        System.out.println("red");
        printColor(red);

        System.out.println("blue");
        printColor(blue);

        System.out.println("white");
        printColor(white);

    }

    public static void printColor(Color color) {
        System.out.println("color.getRed=" + color.getRed());
        System.out.println("color.getGreen=" + color.getGreen());
        System.out.println("color.getBlue=" + color.getBlue());
    }

}
