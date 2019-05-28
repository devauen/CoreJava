package com.proartz.corejava.chapter07.exercise03;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetTest {

    Set<Integer> A;
    Set<Integer> B;

    @Before
    public void initialize() {

        A = new HashSet<>();
        B = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            A.add(i);
        }

        for (int i = 5; i < 15; i++) {
            B.add(i);
        }

    }

    @Test
    public void testSetSum() {
        Set<Integer> sum = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            sum.add(i);
        }

        Set<Integer> C = Sets.sum(A, B);

        assertEquals("Sum is not working", C, sum);

    }

    @Test
    public void testSetIntersection() {
        Set<Integer> intersection = new HashSet<>();
        for (int i = 5; i < 10; i++) {
            intersection.add(i);
        }

        Set<Integer> C = Sets.intersection(A, B);

        assertEquals("Intersection is not working", C, intersection);

    }

    @Test
    public void testSetDifference() {
        Set<Integer> differenceAB = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            differenceAB.add(i);
        }

        Set<Integer> differenceBA = new HashSet<>();
        for (int i = 10; i < 15; i++) {
            differenceBA.add(i);
        }

        Set<Integer> C = Sets.difference(A, B);
        Set<Integer> D = Sets.difference(B, A);

        assertEquals("Difference is not working", C, differenceAB);
        assertEquals("Difference is not working", D, differenceBA);

    }

}
