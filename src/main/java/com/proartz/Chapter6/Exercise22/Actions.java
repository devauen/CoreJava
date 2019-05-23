package com.proartz.Chapter6.Exercise22;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Actions {

    public static <V, T extends Throwable> V doWork(Callable<V> c, Function<Throwable, T> constructor) throws T {
        try {
            return c.call();
        } catch (Throwable realEx) {
            throw constructor.apply(realEx);
        }
    }

}
