package com.proartz.Chapter1.Ch01E16;

public class App {

    public static void main(String[] args) {
        System.out.printf("Average of 17 is: %.2f%n", average(17.0));
        System.out.printf("Average of 17 and 16 is: %.2f%n", average(17.0, 16.0));
        System.out.printf("Average of 17 and 16 and 5 is: %.2f%n", average(17.0, 16.0, 5.0));
    }

    public static double average(double first, double... rest) {
        double sum = first;
        for(double v : rest)
            sum += v;
        return rest.length == 0 ? first : sum / (rest.length + 1);
    }
}
