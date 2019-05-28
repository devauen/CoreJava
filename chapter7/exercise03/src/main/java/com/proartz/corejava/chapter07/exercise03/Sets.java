package com.proartz.corejava.chapter07.exercise03;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static <T> Set<T>  sum(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);

        return result;
    }

    public static <T> Set<T>  intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);

        return result;
    }

    public static <T> Set<T>  difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);

        return result;
    }

}
