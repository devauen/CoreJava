package com.proartz.Chapter5.Exercise13;

import java.util.Arrays;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("com.proartz.Chapter5.Exercise13");
        logger.setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                if(record.getMessage().contains("seks") ||
                        record.getMessage().contains("narkotyki") ||
                        record.getMessage().contains("C++")) {
                    return false;
                }
                return true;
            }
        });

        logger.info("seks");
        logger.info("lubię seks");
        logger.info("seks to jest to");
        logger.info("seks i seks");
        logger.info("C++ jest super");
        logger.info("Religia i narkotyki");
        logger.info("seks seksem seksowny");
        logger.info("seksistowski");
        logger.info("długopis");


    }

}
