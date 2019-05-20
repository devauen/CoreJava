package com.proartz.Chapter6.Exercise13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class TestMaxMin {

    @Test
    public void testMaxMin() {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> results = new ArrayList<>();

        Lists.maxmin(elements, Comparator.naturalOrder(), results);

        assertNotNull(results.get(0));
        assertNotNull(results.get(1));
        assertEquals(Integer.valueOf(5), results.get(0));
        assertEquals(Integer.valueOf(1), results.get(1));
    }

}
