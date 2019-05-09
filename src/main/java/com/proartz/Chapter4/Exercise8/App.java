package com.proartz.Chapter4.Exercise8;

public class App {

    public static void main(String[] args) {

        /*Klasa Class posiada sześć metod zwracających ciąg znaków opisujących typ
        * reprezentowany przez obiekt Class.
         * Dla tablicy metoda getName() zwraca inną niż getCannonicalName nazwę,
         * zgodną z poprzednimi wersjami specyfikacji języka Java. Dla int[] jest to [I.
         *
         * Dla zwykłego typu zwracane ciągi znaków nie różnią się.
         *
         * Dla klasy wewnętrznej:
          * getCannonicalName i getSimpleName, zwracają nazwę klasy taką jak w deklaracji klasy,
          * natomiast pozostałe metody zwracają nazwę klasy w postaci klasaZewnętrzna$klasaWewnętrzna
          *
          * Dla typu prostego:
          * zwracane nazwy nie różnią się.
          * */


        int[] array = new int[5];
        Integer integer = 4;
        test testEnclosing = new test();
        test.testInernal testedClass = testEnclosing.new testInernal();
        int simpleInteger = 3;

        Class<?>[] classes = new Class<?>[4];
        classes[0] = array.getClass();
        classes[1] = integer.getClass();
        classes[2] = testedClass.getClass();
        classes[3] = Integer.TYPE;

        for(Class<?> cl : classes) {
            printClassName(cl);
            System.out.println();
        }
    }

    public static void printClassName(Class<?> cl) {
        System.out.println(
                "cl.getCanonicalName():" + cl.getCanonicalName() + "\n" +
                "cl.getSimpleName():" + cl.getSimpleName() + "\n" +
                "cl.getTypeName():" + cl.getTypeName() + "\n" +
                "cl.getName():" + cl.getName() + "\n" +
                "cl.toString():" + cl.toString() + "\n" +
                "cl.toGenericString():" + cl.toGenericString());
    }
}
