package com.proartz.Chapter3.Exercise4;

public class App {

    public static void main(String[] args) {

        IntSequence intSequence = IntSequence.of();

        while(intSequence.hasNext()) {
            System.out.printf("%d ", intSequence.next());
        }
        System.out.println();

    }

}
