package com.proartz.Chapter3.Exercise15;

import com.proartz.Chapter3.Exercise4.IntSequence;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        IntSequence random = randomInts(5, 10);
        for(int i = 0; i < 10; i++) {
            System.out.println(random.next());
        }
    }

    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

}
