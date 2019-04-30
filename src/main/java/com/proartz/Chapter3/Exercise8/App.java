package com.proartz.Chapter3.Exercise8;

public class App {

    public static void main(String[] args) {
        Runnable task1 = new Greeter(10, "World!");
        Runnable task2 = new Greeter(10, "Void!");
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

    }

}
