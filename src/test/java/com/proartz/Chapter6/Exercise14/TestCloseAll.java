package com.proartz.Chapter6.Exercise14;

import org.junit.Test;

import java.io.Closeable;
import java.util.ArrayList;

import static com.proartz.Chapter6.Exercise14.AutoCloseables.closeAll;
import static org.junit.Assert.assertTrue;

public class TestCloseAll {

    @Test
    public void testCloseAll() {

        ArrayList<SoCloseable> elements = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            elements.add(new SoCloseable());
        }

        try {
            closeAll(elements);
        } catch(Exception ex) {

        }

        for(SoCloseable element : elements) {
            assertTrue(element.isClosed());
        }

    }

}
