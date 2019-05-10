package com.proartz.Chapter4.Exercise9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class test {

    private int number = 0;
    public static String name = "blabla";

    public String showClass(){
        StringBuilder builder = new StringBuilder();

        try {

            // add a package name
            builder.append("Package: " + getClass().getPackage().getName() + "\n");

            // add a class name
            builder.append(Modifier.toString(getClass().getModifiers()) + " ");
            builder.append(getClass().getSimpleName() + " {\n");

            // add all fields info
            for (Field f : getClass().getDeclaredFields()) {
                f.setAccessible(true);
                builder.append("\t" + Modifier.toString(f.getModifiers()) + " " +
                        f.getType().getSimpleName() + " " +
                        f.getName() + " = " +
                        f.get(this) + ";\n");
            }

            builder.append("}\n");

        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }

        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        try {

            builder.append(getClass().getSimpleName());

            // add all fields info
            for (Field f : getClass().getDeclaredFields()) {
                f.setAccessible(true);
                builder.append(
                        "[" +
                        f.getName() + "=" +
                        f.get(this) + "]");
            }

        } catch (ReflectiveOperationException ex) {
            ex.printStackTrace();
        }

        return builder.toString();
    }
}
