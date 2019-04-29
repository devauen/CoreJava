package com.proartz.Chapter3.Exercise5;

public interface IntSequence {

    static IntSequence constant(int value) {
        return ()->value;
    }

    default boolean hasNext() {return true;};
    int next();

}
