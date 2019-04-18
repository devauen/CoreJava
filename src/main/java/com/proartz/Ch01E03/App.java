package com.proartz.Ch01E03;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int[] numbers = readNumbers(3);

        System.out.printf("Max = %d%n", max2(numbers));
    }

    public static int[] readNumbers(int quantity) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[quantity];

        for(int i = 0; i < quantity; i++) {
            System.out.printf("Enter the %d integer: ", i + 1);
            if(scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            }
        }
        return numbers;
    }

    public static int max(int[] numbers) {
        int max = numbers[0] > numbers[1] ? numbers[0] : numbers[1];
        max = max > numbers[2] ? max : numbers[2];

        return max;
    }

    public static int max2(int[] numbers) {
        int max = Math.max(numbers[0], numbers[1]);
        max = Math.max(max, numbers[2]);

        return max;
    }
}
