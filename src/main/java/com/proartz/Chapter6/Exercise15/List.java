package com.proartz.Chapter6.Exercise15;

import java.util.ArrayList;
import java.util.function.Function;

public class List {

    public static <T, R> ArrayList<R> map(ArrayList<T> array, Function<T, R> function) {
        ArrayList<R> result = new ArrayList<>();
        for (T element : array) {
            result.add(function.apply(element));
        }
        return result;
    }
}
