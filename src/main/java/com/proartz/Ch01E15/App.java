package com.proartz.Ch01E15;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>(n);

        for(int i = 0; i < n; i++) {
            triangle.add(i, new ArrayList<>(i + 1));
            for(int j = 0; j < (i + 1); j++) {
                triangle.get(i).add(1);
            }
            triangle.get(i).set(0, 1);
            triangle.get(i).set(i, 1);
            for (int j = 1; j < i ; j++) {
                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                triangle.get(i).set(j, value);
            }
        }

        for(ArrayList<Integer> row : triangle) {
            for(int value : row) {
                System.out.printf("%d ", value);
            }
            System.out.println();
        }
    }
}
