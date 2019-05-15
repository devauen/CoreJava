package com.proartz.Chapter6.Exercise6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> liczby1 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            liczby1.add(i);
        }

        ArrayList<Integer> liczby2 = new ArrayList<>();
        add2(liczby1, liczby2);

        liczby2.forEach(System.out::println);

    }

    public static <E> void add1(ArrayList<? extends E> source, ArrayList<E> target) {
        source.forEach(new Consumer<E>() {
            @Override
            public void accept(E e) {
                target.add(e);
            }
        });
    }

    public static <E> void add2(ArrayList<E> source, ArrayList<? super E> target) {
        source.forEach(new Consumer<E>() {
            @Override
            public void accept(E e) {
                target.add(e);
            }
        });
    }

}
