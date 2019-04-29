package com.proartz.Chapter3.Exercise4;

public interface IntSequence {

    static IntSequence of(int... args) {

        return new IntSequence() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < args.length;
            }

            @Override
            public int next() {
                return args[index++];
            }
        };
    }

    boolean hasNext();
    int next();

}
