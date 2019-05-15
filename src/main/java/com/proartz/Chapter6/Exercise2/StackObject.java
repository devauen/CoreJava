package com.proartz.Chapter6.Exercise2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class StackObject<E>{

    private static final int ARRAY_INITIAL_SIZE = 1;

    private Object[] array;
    private int lastElementIndex;
    private Logger logger;

    public StackObject() throws IOException {
        array = new Object[ARRAY_INITIAL_SIZE];
        lastElementIndex = -1;
        logger = Logger.getLogger("com.proartz.Chapter6.Exercise2.StackObject");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        Handler handler = new FileHandler("logger.log");
        handler.setLevel(Level.ALL);
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getSourceMethodName() + ": "
                        + record.getMessage() + "\n";
            }
        });
        logger.addHandler(handler);
    }

    public E push(E element) {
        logger.entering("com.proartz.Chapter6.Exercise2.StackObject", "push");

        if(isFull()) {
            array = resizeArray();
        }

        array[lastElementIndex + 1] = element;
        lastElementIndex++;

        return element;

    }
 @SuppressWarnings("unchecked")
    private E[] initializeArray(E element) {
        logger.entering("com.proartz.Chapter6.Exercise2.StackObject", "initializeArray");
        logger.info("Initial size of an array is: " + ARRAY_INITIAL_SIZE);
        Class<?> cl = element.getClass();
        return (E[]) java.lang.reflect.Array.newInstance(cl, ARRAY_INITIAL_SIZE);
    }
    public E pop() {
        logger.entering("com.proartz.Chapter6.Exercise2.StackObject", "pop");
        @SuppressWarnings("unchecked")
        E temp = (E) array[lastElementIndex];
        array[lastElementIndex] = null;
        lastElementIndex--;

        return temp;
    }

    private boolean isFull() {
        logger.entering("com.proartz.Chapter6.Exercise2.StackObject", "isFull");
        logger.info(Boolean.toString(lastElementIndex == (array.length - 1)));
        return lastElementIndex == (array.length - 1);
    }

    private Object[] resizeArray() {
        logger.entering("com.proartz.Chapter6.Exercise2.StackObject", "resizeArray");
        logger.info("Old size of an array is: " + array.length);
        logger.info("New size of an array is: " + (array.length * 2));
        return Arrays.copyOf(array, (array.length * 2));
    }
}
