package com.proartz.Chapter6.Exercise12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.proartz.Chapter6.Exercise12.Lists.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class minMaxCompTest {

    @Test
    public void testMinMaxList() {

        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(Integer.valueOf(1), min(array));
        assertEquals(Integer.valueOf(5), max(array));

    }

    @Test
    public void testMinMaxComp() {
        List<Integer> result = new ArrayList<>();
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        minmax(elements, comp , result);
        assertNotNull(result.get(0));
        assertEquals(Integer.valueOf(1), result.get(0));
        assertNotNull(result.get(1));
        assertEquals(Integer.valueOf(5), result.get(1));
    }
}
