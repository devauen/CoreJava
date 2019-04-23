package com.proartz.Chapter1.Ch01E04;

public class App {
    public static void main(String[] args) {
        double number = 0;

        System.out.printf("Smallest double positive value is %.500f%n", Math.nextUp(number));
        System.out.printf("Largest double positive value is %f%n", Double.MAX_VALUE);
    }
}
