package com.proartz.Chapter6.Exercise4;

import java.util.ArrayList;

public class Table<K, V> {

    public class Entry {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    ArrayList<Entry> array;

    public Table() {
        array = new ArrayList<>();
    }

    public V getValue(K key) {
        for(Entry entry : array) {
            if(entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        if(getValue(key) == null) {
            array.add(new Entry(key, value));
        }
    }

    public void removeKey(K key) {
        array.removeIf((Entry kvEntry)->(kvEntry.getKey().equals(key)));
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
