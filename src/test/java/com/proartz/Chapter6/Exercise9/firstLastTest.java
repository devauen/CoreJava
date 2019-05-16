package com.proartz.Chapter6.Exercise9;

import com.proartz.Chapter6.Exercise8.Pair;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

public class firstLastTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public firstLastTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( firstLastTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        ArrayList<Integer> array = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        Pair<Integer> pair = Arrays.firstLast(array);
        assertTrue(pair.getFirst() == 1 && pair.getSecond() == 5);
    }
}
