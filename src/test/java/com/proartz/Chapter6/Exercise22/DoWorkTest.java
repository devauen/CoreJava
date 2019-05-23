package com.proartz.Chapter6.Exercise22;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DoWorkTest {

    @Rule public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testThrowingException() {

        thrown.expect(RuntimeException.class);
        Actions.doWork(()->{throw new RuntimeException();}, RuntimeException::new);

    }

}
