package com.proartz.Chapter4.Exercise13;

import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class App {

    public static void main(String[] args) throws ReflectiveOperationException {

        /*
        * Bezpieczeństwo:
        * refleksja jest mniej bezpiecznym sposobem implementacji,
        * gdyż sięgamy po szczegóły implementacji poszczególnych metod.
        *
        * Wydajność:
        * Po przeprowadzeniu testów, implementacja z refleksją jest szybsza o rząd wielkośći w ns
        *
        * Wygoda stosowania:
        * Zdecydowanie stosowanie interfejsów funkcyjnych jest wygodniejsze.
        * Możemy od razu w argumencie podać metodę, gdzie w przypadku refleksji jest to bardziej
        * uciążliwe lub przynajmniej mniej czytelne.
        *
        * */
        Class<?> cl = Class.forName("java.lang.Math");
        Method sqrt = cl.getMethod("sqrt", double.class);

        cl = Class.forName("java.lang.Double");
        Method toHexString = cl.getMethod("toHexString", double.class);

        long startTime = System.nanoTime();

        methodValues(sqrt, 0.0, 10.0, 1.0);
        methodValues(toHexString, 0.0, 10.0, 1.0);

        long endTime = System.nanoTime();
        long reflectionTime = endTime - startTime;

        startTime = System.nanoTime();

        methodValues2(Math::sqrt, 0.0, 10.0, 1.0);
        methodValues2(Double::toHexString, 0.0, 10.0, 1.0);

        endTime = System.nanoTime();

        long functionalTime = endTime - startTime;

        System.out.println("Reflection in ns: " + reflectionTime);
        System.out.println("Functional in ns: " + functionalTime);


    }

    public static void methodValues(Method method, double min, double max, double step)
            throws ReflectiveOperationException{
        for(double i = min; i < max; i += step) {
            System.out.println("f(" + i + ")=" + method.invoke(null, i));
        }
    }

    public static void methodValues2(DoubleFunction<Object> method,
                                     double min, double max, double step) {
        for(double i = min; i < max; i += step) {
            System.out.println("f(" + i + ")=" + method.apply(i));
        }
    }

}
