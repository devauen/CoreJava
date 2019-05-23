package com.proartz.Chapter6.Exercise21;

public class Arrays {

    @SafeVarargs public static <T> T[] construct(int n, T... objs) {
        @SuppressWarnings("unchecked")
                T[] temp = (T[]) java.lang.reflect.Array.newInstance(
                        objs.getClass().getComponentType(), n);
        return temp;
    }

}
