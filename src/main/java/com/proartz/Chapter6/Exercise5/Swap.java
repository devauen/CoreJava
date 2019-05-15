package com.proartz.Chapter6.Exercise5;

public class Swap {

    /*
    * Dodanie jawnej informacji o typie przed wywołaniem metody swap, znacząco poprawia
    * czytelność błędów. 
    * */
    public static void main(String[] args) {

        Double[] result = Swap.<Double>swap(0, 1, 1.5, 2.0, 3.0);

    }

    @SafeVarargs
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

}
