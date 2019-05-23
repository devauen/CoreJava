package com.proartz.Chapter6.Exercise20;

public class Arrays {

    @SafeVarargs public static final <T> T[] repeat(int n, T... objs) {
        T[] result;
        T obj = objs[0];

        if(objs.length >= n) {
            result = objs;
        } else {
            @SuppressWarnings("unchecked") T[] temp = (T[]) java.lang.reflect.Array.newInstance(
                    objs.getClass().getComponentType(), n);
            result = temp;
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = obj;
        }

        return result;
    }

}
