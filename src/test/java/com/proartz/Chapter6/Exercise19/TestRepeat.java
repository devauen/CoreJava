package com.proartz.Chapter6.Exercise19;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestRepeat {

    int size;
    int obj;

    @Before
    public void initialize() {
        size = 10;
        obj = 46;
    }

    @Test
    public void testRepeatIntArrayList() {
        ArrayList<Integer> result = Arrays.repeat(size, obj);

        assertEquals("Size of the ArrayList should be: " + size, size, result.size());
        for (Integer integer : result) {
            assertEquals("Every element should be: " + obj, Integer.valueOf(obj), integer);
        }
    }

//    @Test
//    public void testRepeatArray() {
//        Integer[] result = Arrays.repeatArray(size, Integer.valueOf(obj));
//
//        assertEquals("Size of the Array should be: " + size, size, result.length);
//        for (Integer integer : result) {
//            assertEquals("Every element should be: " + obj, Integer.valueOf(obj), integer);
//        }
//    }

}
