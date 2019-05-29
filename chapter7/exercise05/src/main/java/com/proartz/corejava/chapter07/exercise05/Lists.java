package com.proartz.corejava.chapter07.exercise05;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Lists {

    public static void swap(List<?> list, int i, int j) {
        if(list instanceof RandomAccess) {
            randomSwap(list, i, j);
        } else {
            iterateSwap(list, i, j);
        }

    }

    public static <T> void randomSwap(List<T> list, int i, int j) {
        System.out.println(">>RANDOM");
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static <T> void iterateSwap(List<T> list, int i, int j) {
        System.out.println(">>ITERATE");
        ListIterator<T> iterator1 = list.listIterator();
        ListIterator<T> iterator2 = list.listIterator();
        T temp1 = null;
        T temp2 = null;

        for (int k = 0; k < (i + 1); k++) {
            if(iterator1.hasNext()) {
                temp1 = iterator1.next();
            }
        }

        for (int k = 0; k < (j + 1); k++) {
            if(iterator2.hasNext()) {
                temp2 = iterator2.next();
            }
        }

        iterator1.set(temp2);
        iterator2.set(temp1);

    }

}
