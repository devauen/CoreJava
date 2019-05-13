package com.proartz.Chapter5.Exercise12;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        /*
        * Assertion was evaluated even when flag -ea was not set making program slower by almost a half
         * */
        Random random = new Random();

        int[] numbers = new int[500];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        /*
        for(int number : numbers) {
            number = random.nextInt();
        }
*/
        //Arrays.asList(numbers).forEach(System.out::println);
        for(int number : numbers) {
            System.out.println(number);
        }

        long startTime = System.nanoTime();

        System.out.println("Min: " + min(numbers));

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println(elapsedTime + " ns");

    }

    public static int min(int[] values) {

        int min = (int) Objects.requireNonNull(values[0]);

        for(int value : values) {
            if(value < min) {
                min = value;
            }
        }

        for(int value : values) {
            //assert min <= value;
        }

        return min;
    }

}
