package com.proartz.Chapter6.Exercise8;

public class Pair<E extends Comparable<? super E>> {

    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E min() {
        return (first.compareTo(second) < 0) ? first : second;
    }

    public E max() {
        return (first.compareTo(second) > 0) ? first : second;
    }
}
