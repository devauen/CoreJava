package com.proartz.Chapter2.Exercise3;

public class App {

    public static void main(String[] args) {
        /* Metoda modyfikując może zwracać nie tylko void. Np. nową wartość zmienionego pola lub wartość
        boolean, określającą pomyślność lub jej brak modyfikacji stanu
         */

        /*Metoda dostępowa, może zwracać void, ale zapewni dostęp do stanu wewnętrznego poprzez inną formę komunikacji z
        innnymi obiektami. np. poprzez wyświetlanie stanu obiektu, na którym została wywołana poprzez
        System.out.println(). Może również zmieniąć zmieniać stan obiektu, którego referencja została
        przekazana jako parametr do metody, używając do tego stanu obiektu, na którym została wywołana
         */


        int[] triangle = new int[10];
        int[] superTriangle = triangle;

        triangle[0] = 6;
        System.out.printf("triangle[0] = %d superTriangle[0] = %d%n", triangle[0], superTriangle[0]);
        System.out.printf("triangle = %s, superTriangle = %s%n", triangle, superTriangle);

        changeArray(superTriangle);

        System.out.printf("triangle[0] = %d superTriangle[0] = %d%n", triangle[0], superTriangle[0]);
        System.out.printf("triangle = %s, superTriangle = %s%n", triangle, superTriangle);
    }

    public static void changeArray(int[] array) {
        array[0] = 7;
    }
}
