package com.proartz.Chapter6.Exercise10;

public class Arrays {

    public static <E extends Comparable<? super E>> E min(E[] array) {
        E min = array[0];
        for(E element : array) {
            min = (min.compareTo(element) < 0) ? min : element;
        }
        return min;
    }

    public static <E extends Comparable<? super E>> E max(E[] array) {
        E max = array[0];
        for(E element : array) {
            max = (max.compareTo(element) > 0) ? max : element;
        }
        return max;
    }

}
