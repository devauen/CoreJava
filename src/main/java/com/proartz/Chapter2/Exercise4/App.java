package com.proartz.Chapter2.Exercise4;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.IntHolder;

public class App {

    public static void main(String[] args) {
        /*int jest typem prostym przechowującym bezpośrednio wartość liczbową, nie będącą
        referencją do żadnego obiektu przechowywaną na stosie. Parametry w Javie są przekazywane
        poprzez wartość, dlatego przekazanie zmiennej typu int wiąże się z przekazanie jej bezpośredniej
        wartości liczbowej, a nie referencji do tej zmiennej. Stąd wewnątrz metody nie możemy zmienić
        zawartości przekazanej w parametrze zmiennej typu int.
         */

        IntHolder int1 = new IntHolder();
        IntHolder int2 = new IntHolder();

        int1.value = 4;
        int2.value = 7;

        System.out.printf("int1 = %d, int2 = %d%n", int1.value, int2.value);

        exchangeInts(int1, int2);

        System.out.printf("int1 = %d, int2 = %d%n", int1.value, int2.value);

        Integer int3 = new Integer(4);
        Integer int4 = new Integer(7);

        System.out.printf("int3 = %d, int4 = %d%n", int3, int4);

        exchangeIntegers(int3, int4);

        System.out.printf("int3 = %d, int4 = %d%n", int3, int4);

        /* Typy opakowujące, jak Integer są niezmienne i przekazywanie wartości z tych obiektów
        odbywa się automatycznie za pomocą rozpakowywania, co uniemożliwia napisania metody
        zamieniającej zawartość zmiennych tego typu.

         */
    }
    public static void exchangeInts(IntHolder int1, IntHolder int2) {
        int temp = int1.value;
        int1.value = int2.value;
        int2.value = temp;
    }

    public static void exchangeIntegers(Integer int1, Integer int2) {
        Integer temp = int1;
        int1 = int2;
        int2 = temp;
    }
}
