package com.proartz.corejava.chapter07.exercise05;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class SwapTest {

    @Test
    public void testArrayListSwap() {

        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Lists.swap(array, 0, 9);

        assertEquals("Elements not swapped", Integer.valueOf(10), array.get(0));
        assertEquals("Elements not swapped", Integer.valueOf(1), array.get(9));

    }

    @Test
    public void testLinkedListSwap() {

        List<Integer> array = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Lists.swap(array, 0, 9);

        assertEquals("Elements not swapped", Integer.valueOf(10), array.get(0));
        assertEquals("Elements not swapped", Integer.valueOf(1), array.get(9));

    }

}
