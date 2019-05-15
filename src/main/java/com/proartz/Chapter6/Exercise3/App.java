package com.proartz.Chapter6.Exercise3;

import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("com.proartz.Chapter6.Exercise3");

        Table<String, String> knowledge = new Table<>();

        String key = "Lacan";
        String value = "Women does not exist";

        knowledge.add(key, value);
        assert knowledge.getValue(key) != null;
        System.out.println("Table.add() test pass");
        logger.info("Entry(" + key.toString() + ", " + value.toString() + ") added to table knowledge.");

        assert knowledge.getValue("Lacan").equals("Women does not exist");
        System.out.println("Table.getValue() test pass");
        logger.info("Entry with key: " + key.toString() + " have value: " + knowledge.getValue(key));

        knowledge.removeKey("Lacan");
        assert knowledge.getValue("Lacan") == null;
        System.out.println("Table.removeKey() test pass");
        logger.info("Entry with key: " + key.toString() + " was removed from table knowledge");

    }

}
