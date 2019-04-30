package com.proartz.Chapter3.Exercise6;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        Iterator<Integer> iterator = new DigitSequence(123);

        while(iterator.hasNext()) {
            System.out.printf("%d ", iterator.next());
        }
        System.out.println();

        /*
        Możliwość definiowania metod domyślnych w interfejsie pozwala na zgodność,
        z aplikacjami napisanymi i skompilowanymi w starszej wersji javy.
         */
    }

}
