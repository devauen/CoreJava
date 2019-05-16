package com.proartz.Chapter6.Exercise11;

import com.proartz.Chapter6.Exercise11.Arrays;
import com.proartz.Chapter6.Exercise8.Pair;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class minMaxPairTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public minMaxPairTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( minMaxPairTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Integer[] array = {1, 2, 3, 4, 5};
        Pair<Integer> pair = Arrays.minMax(array);

        assertTrue(pair.getFirst() == 1);
        assertTrue(pair.getSecond() == 5);
    }
}
