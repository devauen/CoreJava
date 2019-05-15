package com.proartz.Chapter6.Exercise8;

import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("com.proartz.Chapter6.Exercise8");

        Pair<Integer> pair = new Pair<>(1, 2);
        assert pair.min() == 1;
        assert pair.max() == 2;
        assert pair.getFirst() == 1;
        assert pair.getSecond() == 2;
        logger.info("All 4 tests passed");
    }
}
