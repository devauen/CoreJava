package com.proartz.Chapter6.Exercise2;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StackGeneric<E> {
    private static final int ARRAY_INITIAL_SIZE = 1;

    private E[] array;
    private int lastElementIndex;
    private Logger logger;

    public StackGeneric() {
        array = null;
        lastElementIndex = -1;
        logger = Logger.getLogger("com.proartz.Chapter6.Exercise2.StackGeneric");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
    }

    public E push(E element) {
        logger.entering("com.proartz.Chapter6.Exercise2.StackGeneric", "push");

     if(array == null) {
         array = initializeArray(element);
     }

     if(isFull()) {
         array = resizeArray();
     }

     array[lastElementIndex + 1] = element;
     lastElementIndex++;

     return element;

    }

    public E pop() {
        logger.entering("com.proartz.Chapter6.Exercise2.StackGeneric", "pop");
        E temp = array[lastElementIndex];
        array[lastElementIndex] = null;
        lastElementIndex--;

        return temp;
    }

    @SuppressWarnings("unchecked")
    private E[] initializeArray(E element) {
        logger.entering("com.proartz.Chapter6.Exercise2.StackGeneric", "initializeArray");
        logger.info("Initial size of an array is: " + ARRAY_INITIAL_SIZE);
        Class<?> cl = element.getClass();
        return (E[]) java.lang.reflect.Array.newInstance(cl, ARRAY_INITIAL_SIZE);
    }

    private boolean isFull() {
        logger.entering("com.proartz.Chapter6.Exercise2.StackGeneric", "isFull");
        return lastElementIndex == (array.length - 1);
    }

    private E[] resizeArray() {
        logger.entering("com.proartz.Chapter6.Exercise2.StackGeneric", "resizeArray");
        logger.info("Old size of an array is: " + array.length);
        logger.info("New size of an array is: " + (array.length * 2));
        return Arrays.copyOf(array, (array.length * 2));
    }
}
