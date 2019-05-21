package com.proartz.Chapter6.Exercise18;

import org.junit.Test;

import java.util.function.IntFunction;

import static org.junit.Assert.assertEquals;

public class TestRepeat {

    /*
    *   public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
    *       return null;
    *   }
    *
    * */


    @Test
    public void testRepeatForInt() {
        int size = 10;
        int obj = 42;
        Integer[] ints = Arrays.repeat(size, obj, Integer[]::new);
        
        assertEquals("Size of the array should be " + size , size, ints.length);
        for (Integer integer : ints) {
            assertEquals("Object should be " + obj, Integer.valueOf(obj), integer);
        }
    }

}
