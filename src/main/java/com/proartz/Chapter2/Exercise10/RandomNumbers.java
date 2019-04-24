package com.proartz.Chapter2.Exercise10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {

    private static Random random = new Random();

    public RandomNumbers(int size) {
    }

    public static int randomElement(Integer[] array) {
        if(array.length == 0) {
            return 0;
        }

        return array[random.nextInt(array.length + 1)];
    }

    public static int randomElement(ArrayList<Integer> list) {
        if(list.size() == 0) {
            return 0;
        }
        return list.get(random.nextInt(list.size() + 1));
    }
}
