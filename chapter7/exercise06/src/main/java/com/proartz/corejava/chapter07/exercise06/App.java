package com.proartz.corejava.chapter07.exercise06;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Map<String, Set<Integer>> map = new HashMap<>();
        map.put("test", new HashSet<>(Arrays.asList(1, 2, 3, 4)));
        map.put("test2", new HashSet<>(Arrays.asList(4, 5, 6, 7)));

//        for(Map.Entry<String, Set<Integer>> entry : map.entrySet()){
//
//           String key = entry.getKey();
//           Set<Integer> value = entry.getValue();
//
//            System.out.println("Key: " + key);
//            System.out.println("Value: ");
//            value.forEach(System.out::println);
//
//        }

        Set<Integer> test = map.get("test");
        test.add(5);

        for(Set<Integer> value : map.values()) {
            System.out.println("Value: ");
            value.forEach((integer)-> System.out.print(integer + ", "));
            System.out.println();
        }
    }
}
