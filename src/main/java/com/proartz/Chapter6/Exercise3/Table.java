package com.proartz.Chapter6.Exercise3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Table<K, V> {

    ArrayList<Entry<K, V>> array;

    public Table() {
        array = new ArrayList<>();
    }

    public V getValue(K key) {
        for(Entry<K, V> entry : array) {
            if(entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        if(getValue(key) == null) {
            array.add(new Entry<>(key, value));
        }
    }

    public void removeKey(K key) {
        array.removeIf((Entry<K, V> kvEntry)->(kvEntry.getKey().equals(key)));
//        // version with anonymous class
//        new Predicate<Entry<K, V>>() {
//            @Override
//            public boolean test(Entry<K, V> kvEntry) {
//                return kvEntry.getKey().equals(key);
//            }
//
//        });
//        // version with extended for loop
//        for(Entry<K, V> entry : array) {
//            if(entry.getKey().equals(key)){
//                array.remove(entry);
//            }
//        }
    }
}
