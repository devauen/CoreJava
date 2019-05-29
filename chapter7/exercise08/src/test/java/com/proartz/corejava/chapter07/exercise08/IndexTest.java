package com.proartz.corejava.chapter07.exercise08;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class IndexTest
{

    Map<String, Set<Integer>> proper;

    @Before
    public void initialize() {

        proper = new HashMap<>();
        proper.put("kredki", new HashSet<>(Arrays.asList(2, 4, 6, 8)));
        proper.put("ołówek", new HashSet<>(Arrays.asList(1, 3, 5, 7)));
        proper.put("rower", new HashSet<>(Arrays.asList(5)));
        proper.put("szklanka", new HashSet<>(Arrays.asList(1, 8)));

    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMakeIndex() throws IOException
    {
        Map<String, Set<Integer>> index = Index.makeIndex("test.txt");
        assertEquals(proper, index);
    }
}
