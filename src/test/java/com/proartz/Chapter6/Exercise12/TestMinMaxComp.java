package com.proartz.Chapter6.Exercise12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.proartz.Chapter6.Exercise12.Lists.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMinMaxComp {

    List<Integer> elements;

    @Before
    public void initialize() {
        elements = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    @Test
    public void testMinMaxList() {

        assertEquals(Integer.valueOf(1), min(elements, Comparator.naturalOrder()));
        assertEquals(Integer.valueOf(5), max(elements, Comparator.naturalOrder()));

    }

    @Test
    public void testMinMaxComp() {
        List<Integer> result = new ArrayList<>();

        minmax(elements, Comparator.naturalOrder() , result);
        assertNotNull(result.get(0));
        assertEquals(Integer.valueOf(1), result.get(0));
        assertNotNull(result.get(1));
        assertEquals(Integer.valueOf(5), result.get(1));
    }
}
