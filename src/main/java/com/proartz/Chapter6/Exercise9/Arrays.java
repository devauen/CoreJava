package com.proartz.Chapter6.Exercise9;

import com.proartz.Chapter6.Exercise8.Pair;

import java.util.ArrayList;

public class Arrays {

    public static <E extends Comparable<? super E>> Pair<E> firstLast(ArrayList<? extends E> a) {
        E first = a.get(0);
        E last = a.get(a.size()-1);

        return new Pair<>(first, last);
    }

}
