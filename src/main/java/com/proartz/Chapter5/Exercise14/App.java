package com.proartz.Chapter5.Exercise14;

import java.io.IOException;
import java.util.logging.*;

public class App {

    public static void main(String[] args) throws IOException {

        FileHandler handler = new FileHandler("java%u.html");
        Logger logger = Logger.getLogger("com.proartz.Chapter5.Exercise14");
        logger.addHandler(handler);
        handler.setFormatter(new Formatter() {

            @Override
            public String getHead(Handler h) {
                return "<html>\n" + "<body>\n";
            }

            @Override
            public String getTail(Handler h) {
                return "</body>\n" + "</html>\n";
            }

            @Override
            public String format(LogRecord record) {
                return "<p>" + record.getMessage() + "</p>\n";
            }
        });

        logger.info("Testujemy");
        logger.info("HTML");
        logger.info("Yeah!");

    }

}
