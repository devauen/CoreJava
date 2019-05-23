package com.proartz.Chapter6.Exercise21;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConstructTest {

    int size;
    Object[] objs;
    List<String>[] array;

    @Before
    @SuppressWarnings("unchecked")
    public void initialize() {
        size = 10;
        objs = Arrays.<List<String>>construct(size);
        array = (List<String>[]) new List<?>[size];
    }

    @Test
    public void testArrayType() {
        assertEquals(
                array.getClass().getComponentType(),
                objs.getClass().getComponentType());
    }

    @Test
    public void testArraySize() {
        assertEquals(size, objs.length);
    }

}
