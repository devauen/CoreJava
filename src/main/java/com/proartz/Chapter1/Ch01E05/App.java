package com.proartz.Chapter1.Ch01E05;

public class App {

    public static void main(String[] args) {
        double number = Integer.MAX_VALUE + 500.0;
//        number++;
        int castedNumber = (int)number;


        System.out.printf("Integer.MAX_VALUE: %d%n", Integer.MAX_VALUE);
        System.out.printf("Number: %f%n", number);
        System.out.printf("CastedNumber: %d%n", castedNumber);
    }
}
