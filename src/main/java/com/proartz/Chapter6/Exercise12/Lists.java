package com.proartz.Chapter6.Exercise12;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lists {

    public static <T> void minmax(List<T> elements, Comparator<? super T> comp,
                                  List<? super T> result) {
        result.add(min(elements, comp));
        result.add(max(elements, comp));
    }

    public static <T> T min(List<T> list, Comparator<? super T> comp) {
        T min = list.get(0);
        for(T element : list) {
            min = (comp.compare(min, element) < 0) ? min : element;
        }
        return min;
    }

    public static <T> T max(List<T> list, Comparator<? super T> comp) {
        T max = list.get(0);
        for(T element : list) {
            max = (comp.compare(max, element) > 0) ? max : element;
        }
        return max;
    }

}
