package com.proartz.Chapter6.Exercise20;

import org.junit.Test;

import static com.proartz.Chapter6.Exercise20.Arrays.repeat;
import static org.junit.Assert.assertEquals;

public class RepeatTest {

    @Test
    public void testCreatingArray() {

        int size = 10;
        String obj = "Hello";

        String[] objs = repeat(size, obj);
        assertEquals("Array should have size: " + size, objs.length, size);

        for (String element : objs) {
            assertEquals("Each element should be: " + obj, element, obj);
        }
    }

}
