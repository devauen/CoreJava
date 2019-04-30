package com.proartz.Chapter3.Exercise7;

import java.util.*;

public class App {

    public static void main(String[] args) {
//        ArrayList<String> names = generateNames(10);
        ArrayList<String> names;
        names = new ArrayList<>(Arrays.asList("alabasterakila",
                "nomhehrt",
                "hgrtla",
                "hrtys",
                "nui",
                "dheujdkfif",
                "jkliena"));
        printList(names);
        System.out.println();

        luckySort(names, Comparator.comparingInt(String::length));

        printList(names);
    }

    public static ArrayList<String> generateNames(int n) {
        Random random = new Random();

        ArrayList<String> names = new ArrayList<>(n);
        long number;

        for(int i = 0; i < n; i++) {
            number = random.nextLong();
            names.add(Long.toString(number, 36));
        }

        return names;
    }

    private static void printList(ArrayList<String> list) {
        for(String string : list) {
            System.out.println(string);
        }
    }

    private static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> sortedStrings = new ArrayList<>(strings);
        sortedStrings.sort(comp);

        while(!strings.equals(sortedStrings)) {
            Collections.shuffle(strings);
        }
    }

}
