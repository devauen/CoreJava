package com.proartz.Chapter2.Exercise10;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        /*
        Jeżeli metody randomElement nie byłyby statyczne, potrzebny byłaby instancja obiektu klasy
        RandomNumbers, na której metody byłyby wykonywane.
        Jako metody statyczne, można je wywoływać bez istniejącego obektu klasy RandomNumbers
         */

        Integer[] numbers = {13, 42, 65, 1, 7, 45};

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(numbers));

        for(int i = 0; i < 10; i++) {
            System.out.println(RandomNumbers.randomElement(numbers2));
        }
    }
}
