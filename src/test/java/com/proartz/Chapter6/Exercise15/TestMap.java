package com.proartz.Chapter6.Exercise15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Function;

import static com.proartz.Chapter6.Exercise15.List.map;
import static org.junit.Assert.*;

public class TestMap {

    @Test
    public void testMap() {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            array.add(i);
        }
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        result = map(array, (integer)->(integer * 2));

        for(int i = 0; i < array.size(); i++) {
            assertNotNull(result.get(i));
            assertEquals(Integer.valueOf(array.get(i) * 2), result.get(i));
        }
    }

}
