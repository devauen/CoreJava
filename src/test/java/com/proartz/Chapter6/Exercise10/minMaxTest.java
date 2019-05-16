package com.proartz.Chapter6.Exercise10;

import com.proartz.Chapter6.Exercise8.Pair;
import com.proartz.Chapter6.Exercise10.Arrays;
import com.proartz.Chapter6.Exercise9.firstLastTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

public class minMaxTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public minMaxTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( minMaxTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Integer[] array = {1, 2, 3, 4, 5};

        assertTrue(Arrays.min(array) == 1);
        assertTrue(Arrays.max(array) == 5);
    }
}
