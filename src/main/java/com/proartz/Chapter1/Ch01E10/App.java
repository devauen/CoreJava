package com.proartz.Chapter1.Ch01E10;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        long randomString = random.nextLong();

        System.out.printf("Random string: %s%n", Long.toString(randomString, 36));
    }
}
