package com.proartz.Chapter6.Exercise1;

import java.util.ArrayList;

public class Stack<E> {

    private ArrayList<E> array = new ArrayList<>();

    public Stack() {}

    public E push(E element) {

        array.add(element);

        return element;
    }

    public E pop() {
        int lastIndex = array.size() - 1;
        E temp = array.get(lastIndex);
        array.remove(lastIndex);

        return temp;
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

}
