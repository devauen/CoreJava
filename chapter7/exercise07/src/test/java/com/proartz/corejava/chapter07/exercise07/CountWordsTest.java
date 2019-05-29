package com.proartz.corejava.chapter07.exercise07;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CountWordsTest {

    Map<String, Integer> proper;

    @Before
    public void initialize() {

        proper = new HashMap<>();
        proper.put("Nafta", 6);
        proper.put("kolor", 5);
        proper.put("rower", 1);
        proper.put("kredki", 3);

    }

    @Test
    public void testCountWordsOld() throws IOException {

        Map<String, Integer> testMap = Counters.countWordsOld("words.txt");
        assertEquals(proper, testMap);

    }

    @Test
    public void testCountWords() throws IOException {

        Map<String, Integer> testMap = Counters.countWordsOld("words.txt");
        assertEquals(proper, testMap);

    }


}
