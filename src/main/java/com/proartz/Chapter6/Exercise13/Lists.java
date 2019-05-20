package com.proartz.Chapter6.Exercise13;
import java.util.Comparator;
import java.util.List;

import static com.proartz.Chapter6.Exercise12.Lists.*;

public class Lists {

    public static <T> void maxmin(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
        Lists.swap(result, 0, 1);
    }

    private static <T> void swap(List<T> result, int i, int i1) {
        T temp = result.get(i);
        result.set(i, result.get(i1));
        result.set(i1, temp);
    }

}
