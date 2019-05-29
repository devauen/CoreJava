package com.proartz.corejava.chapter07.exercise04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ExceptionsTest {

    @Test(expected = ConcurrentModificationException.class)
    public void testCollectionModificationWhileIterating() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Iterator<Integer> iterator = array.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

            //this should throw an exception
            array.add(11);
        }
    }
}
