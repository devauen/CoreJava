package com.proartz.chapter07.exercise02;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> words = new ArrayList<>();

        words.add("SOME");
        words.add("RANDOM");
        words.add("TEXT");
        words.add("FOR");
        words.add("THE");


//        // using iterator
//        ListIterator<String> iterator = words.listIterator();
//        while(iterator.hasNext()) {
//            String word = iterator.next().toLowerCase();
//            System.out.println(word);
//            iterator.set(word);
//        }

//        // using for loop
//        for (int i = 0; i < words.size(); i++) {
//            String word = words.get(i).toLowerCase();
//            words.set(i, word);
//        }

        // using replaceAll
        words.replaceAll((word)->word.toLowerCase());
        words.forEach(System.out::println);

    }
}
