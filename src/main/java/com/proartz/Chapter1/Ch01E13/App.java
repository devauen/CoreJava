package com.proartz.Chapter1.Ch01E13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] result = new int[6];

        for(int i = 0; i < 49 ; i++) {
            numbers.add(i + 1);
        }

        for(int i = 0; i < 6; i++) {
            int chosen = random.nextInt(numbers.size() - 1);

            result[i] = numbers.get(chosen);
            numbers.remove(chosen);
        }

        Arrays.sort(result);

        System.out.println("Result:");
        for(int i : result) {
            System.out.println(i);
        }
    }
}
