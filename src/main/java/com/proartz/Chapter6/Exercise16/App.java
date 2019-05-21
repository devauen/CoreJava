package com.proartz.Chapter6.Exercise16;

public class App {

    /*
    * public static <T extends Comparable<? super T>> void sort(List<T> list)
    *     zgodnie z zasadą wymazywania do pierwszego ograniczenia zostanie
    *     wymazane do: public static void sort(List<Comparable> list)
    *
    * public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll
    *   podobnie zostanie wymazane do:
    *   public static Object max(Object coll)
    * */

}
