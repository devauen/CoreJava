package com.proartz.Chapter6.Exercise15;

import java.util.ArrayList;
import java.util.function.Function;

public class List {

    public static <T> ArrayList<T> map(ArrayList<T> array, Function<T, T> function) {
        ArrayList<T> result = new ArrayList<>();
        for (T element : array) {
            result.add(function.apply(element));
        }
        return result;
    }
}
