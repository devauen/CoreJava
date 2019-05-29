package com.proartz.corejava.chapter07.exercise07;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counters {

    public static Map<String, Integer> countWords(String filename) throws IOException {

        Map<String, Integer> words = new HashMap<>();

        Scanner in = new Scanner(Paths.get(filename), "UTF-8");
        while (in.hasNext()) {
            String word = in.next();
            words.merge(word, 1, Integer::sum);
        }

        return words;
    }

    public static Map<String, Integer> countWordsOld(String filename) throws IOException {

        Map<String, Integer> words = new HashMap<>();

        Scanner in = new Scanner(Paths.get(filename), "UTF-8");
        while (in.hasNext()) {

            String word = in.next();

            if (words.containsKey(word)) {
                int counter = words.get(word);
                counter++;
                words.replace(word, counter);
            } else {
                words.put(word, 1);
            }
        }

        in.close();

        return words;
    }
}
