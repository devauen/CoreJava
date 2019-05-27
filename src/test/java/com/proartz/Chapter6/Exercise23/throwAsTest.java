package com.proartz.Chapter6.Exercise23;

import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Callable;

public class throwAsTest {

    @Test(expected = RuntimeException.class)
    public void testNoExceptionThrown() {

        Exceptions.doWork(()->new Callable<String>() {
            @Override
            public String call() throws Exception {
                throw new Exception();
            }
        });
    }

}
