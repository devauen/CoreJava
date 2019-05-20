package com.proartz.Chapter6.Exercise12;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lists {

    public static <T extends Comparable<? super T>> void minmax(List<T> elements, Comparator<? super T> comp,
                                  List<? super T> result) {
        result.add(min(elements));
        result.add(max(elements));
    }

    public static <T extends Comparable<? super T>> T min(List<T> list) {
        T min = list.get(0);
        for(T element : list) {
            min = (min.compareTo(element) < 0) ? min : element;
        }
        return min;
    }

    public static <T extends Comparable<? super T>> T max(List<T> list) {
        T max = list.get(0);
        for(T element : list) {
            max = (max.compareTo(element) > 0) ? max : element;
        }
        return max;
    }

}
