package com.proartz.Chapter3.Exercise5;

public class App {

    public static void main(String[] args) {

        IntSequence sequence = IntSequence.constant(1);

        while(sequence.hasNext()) {
            System.out.printf("%d ", sequence.next());
        }

    }

}
