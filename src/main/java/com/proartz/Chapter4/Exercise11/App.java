package com.proartz.Chapter4.Exercise11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws ReflectiveOperationException{

        Class<?> cl = Class.forName("java.lang.System");
        Field f = cl.getField("out");
        f.setAccessible(true);
        Object out = f.get(new Object());
        Method m = out.getClass().getMethod("println", String.class);
        m.invoke(out, "Witaj, świecie");

    }

}
