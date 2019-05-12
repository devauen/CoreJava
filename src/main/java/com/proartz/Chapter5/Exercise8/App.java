package com.proartz.Chapter5.Exercise8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {

    public static void main(String[] args) throws Exception{
        
        try(AutoCloseable auto = rentrantTry(new ReentrantLock())) {
            System.out.println("Tekst");
        }

    }

    public static AutoCloseable rentrantTry(Lock newLock) {

        newLock.lock();
        return newLock::unlock;
    }

}
