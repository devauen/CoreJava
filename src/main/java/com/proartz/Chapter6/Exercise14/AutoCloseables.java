package com.proartz.Chapter6.Exercise14;

import java.util.ArrayList;

public class AutoCloseables {

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception{

        int i = 0;
        Exception exception = null;

        for(T elem : elems) {
            try {
                elem.close();
            } catch (Exception ex) {
                if(exception == null) {
                    exception = ex;
                } else {
                    ex.initCause(exception);
                    exception = ex;
                }
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
