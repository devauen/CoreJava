package com.proartz.Chapter4.Exercise12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws ReflectiveOperationException{

        Class<?> cl = Class.forName("java.lang.System");
        Field f = cl.getField("out");
        f.setAccessible(true);
        Object out = f.get(new Object());
        Method m = out.getClass().getMethod("println", String.class);

        long startTime = System.nanoTime();
        m.invoke(out, "Witaj, świecie");
        long endTime = System.nanoTime();

        long reflectionTime = endTime - startTime;

        startTime = System.nanoTime();
        System.out.println("Witaj, świecie");
        endTime = System.nanoTime();

        long normalTime = endTime - startTime;

        System.out.println("Reflection: " + reflectionTime + " ns\n" +
                "Normal: " + normalTime + " ns\n" +
                "Difference: " + (reflectionTime - normalTime) + " ns");

    }

}
