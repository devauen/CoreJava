package com.proartz.Chapter6.Exercise14;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static com.proartz.Chapter6.Exercise14.AutoCloseables.closeAll;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeNoException;

public class TestCloseAll {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCloseAllNoExceptions() throws Exception {

        ArrayList<SoCloseable> elements = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            elements.add(new SoCloseable());
        }

        try {
            closeAll(elements);
        } catch(RuntimeException ex) {
            assumeNoException(ex);
        }

        for(SoCloseable element : elements) {
            assertTrue(element.isClosed());
        }

    }

    @Test
    public void testCloseAllOneException() {
        ArrayList<SoCloseable> elements = new ArrayList<>();
        String message = "Unable to close";

        elements.add(new ThrowingCloseable(message));

        for(int i = 0; i < 10; i++) {
            elements.add(new SoCloseable());
        }

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(message);

        closeAll(elements);

    }

    @Test
    public void testCloseAllExceptionChaining() {
        ArrayList<SoCloseable> elements = new ArrayList<>();
        String first = "First message";
        String second = "Second message";
        String third = "Third message";

        elements.add(new ThrowingCloseable(first));
        elements.add(new ThrowingCloseable(second));
        elements.add(new ThrowingCloseable(third));

        try{
            closeAll(elements);
        } catch (RuntimeException ex) {
            assertEquals(ex.getMessage(), third);
            ex = (RuntimeException)ex.getCause();

            assertEquals(ex.getMessage(), second);
            ex = (RuntimeException)ex.getCause();

            assertEquals(ex.getMessage(), first);
        }
    }

    @Test
    public void testCloseAllExceptionWithClosing() {
        ArrayList<SoCloseable> elements = new ArrayList<>();
        String message = "Unable to close";
        Exception exception = null;

        elements.add(new ThrowingCloseable(message));
        for(int i = 0; i < 10; i++) {
            elements.add(new SoCloseable());
        }

        try {
            closeAll(elements);
        } catch(RuntimeException ex) {
             exception = ex;
        }

        assertNotNull(exception);

        for (int i = 0; i < 10; i++) {
            if(i == 0) {
                assertFalse("Element should be left opened", elements.get(i).isClosed());
            } else {
                assertTrue("Element should be closed", elements.get(i).isClosed());
            }
        }
    }

}
