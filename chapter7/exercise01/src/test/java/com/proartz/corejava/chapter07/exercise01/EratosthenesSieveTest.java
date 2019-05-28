package com.proartz.corejava.chapter07.exercise01;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Set;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class EratosthenesSieveTest {

    Logger logger;
    ArrayList<Integer> primes;
    int n;
    StringBuilder builder;

    @Before
    public void initialize() {
        logger = Logger.getLogger("com.proartz.corejava.chapter07.exercise01");
        primes = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97));
        n = 100;
        builder = new StringBuilder();
    }

    @Test
    public void testHashSetSieve() {

        Set<Integer> temp = Math.eratosthenesSieveHash(n);

        assertTrue("Set should contain all the primes", temp.containsAll(primes));

        temp.removeAll(primes);

        assertTrue("Set should contain only the primes", temp.isEmpty());

    }

    @Test
    public void testBitSetSieve() {
        BitSet bitPrimes = new BitSet(n);
        primes.forEach(bitPrimes::set);

        BitSet temp = Math.eratosthenesSieveBitSet(n);

        temp.xor(bitPrimes);
        assertTrue("Set of the numbers are not the set of primes", temp.isEmpty());

    }

}
