package com.proartz.Chapter6.Exercise19;

import java.util.ArrayList;

public class Arrays {

    /*
    * T[] array = result.toArray();
    *
    * Bez użycia refleksji lub przekazania konstruktora nie jest możliwe utworzenie
    * tablicy T[] z tablicy ArrayList<T>.
    *
    * Użycie:
    *
    * result.toArray(T[] array)
    *
    * wymaga wcześniejszego utworzenia typu tablicowego T[],
    * którego inicjalizacja wymaga użycia refleksji lub przekazania konstruktora
    *
    * */

    public static <T> ArrayList<T> repeat(int n, T obj) {
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(obj);
        }

        return result;
    }

//    public static <T> T[] repeatArray(int n, T obj){
//        ArrayList<T> result = repeat(n, obj);
//        T[] array = result.toArray();
//
//        return array;
//    }

}
