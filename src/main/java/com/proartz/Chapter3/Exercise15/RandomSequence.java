package com.proartz.Chapter3.Exercise15;

import com.proartz.Chapter3.Exercise4.IntSequence;

import java.util.Random;

public class RandomSequence implements IntSequence {
    private Random random = new Random();
    private int low;
    private int high;

    public RandomSequence(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public boolean hasNext() {
        return true;
    }

    public int next() {
        return low + random.nextInt(high - low +1);
    }
}