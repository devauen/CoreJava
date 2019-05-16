package com.proartz.Chapter6.Exercise11;

import com.proartz.Chapter6.Exercise8.Pair;
import static com.proartz.Chapter6.Exercise10.Arrays.*;

public class Arrays {

    public static <E extends Comparable<? super E>> Pair<E> minMax(E[] array) {
        return new Pair<>(min(array), max(array));
    }

}
