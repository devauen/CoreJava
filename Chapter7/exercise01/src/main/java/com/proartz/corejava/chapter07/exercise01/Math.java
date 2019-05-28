package com.proartz.corejava.chapter07.exercise01;

import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Math {

    public static HashSet<Integer> eratosthenesSieveHash(int n) {
        Set<Integer> integers = new HashSet<>(n);
        Set<Integer> primes = new HashSet<>(n);
        for (int i = 2; i < n; i++) {
            integers.add(i);
        }


        while (!integers.isEmpty()) {
            int element = Collections.min(integers);
            primes.add(element);
            integers.remove(element);

            int multiplicationOfElement = element * element;
            while(multiplicationOfElement < n) {
                integers.remove(multiplicationOfElement);
                multiplicationOfElement += element;
            }
        }

        return (HashSet<Integer>)primes;
    }

    public static BitSet eratosthenesSieveBitSet(int n) {
        BitSet primes = new BitSet(n + 1);
        int currentPrime;
        for (int i = 2; i < n; i++) {
            primes.set(i);
        }

        currentPrime = 2;

        while((currentPrime * currentPrime) < n) {

            int element = currentPrime * currentPrime;
            while(element < n) {
                primes.clear(element);
                element += currentPrime;
            }
            currentPrime = primes.nextSetBit(currentPrime + 1);
        }
        return primes;
    }

}
