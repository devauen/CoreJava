package com.proartz.Chapter6.Exercise14;

import java.util.ArrayList;

public class AutoCloseables {

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) {

        int i = 0;
        RuntimeException exception = null;

        for(T elem : elems) {
            try {
                elem.close();
            } catch (Exception ex) {
                exception = new RuntimeException(ex.getMessage(), exception);
            }
        }
        if(exception != null) {
            throw exception;
        }
    }

    public static void showAllCauses(Throwable exception) {
        if(exception.getCause() != null) {
            showAllCauses(exception.getCause());
        }

        System.out.println(exception.getMessage());
    }

}
