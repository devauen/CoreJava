package com.proartz.corejava.chapter07.exercise08;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Index {

    public static Map<String, Set<Integer>> makeIndex(String filename) throws IOException {

        Scanner in = new Scanner(Paths.get(filename), "UTF-8");
        Map<Integer, String> lines = new HashMap<>();
        Map<String, Set<Integer>> index = new HashMap<>();

        int lineNumber = 1;
        while(in.hasNextLine()) {
            String[] line = in.nextLine().split(" ");

            for(String key : line) {
                index.putIfAbsent(key, new HashSet<>());
                index.get(key).add(lineNumber);
            }
            lineNumber++;
        }

        return index;

    }

}
