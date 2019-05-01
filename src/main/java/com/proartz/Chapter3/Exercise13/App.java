package com.proartz.Chapter3.Exercise13;

public class App {

    public static void main(String[] args) {

        Runnable[] tasks = new Runnable[10];

        for(int i = 0; i < tasks.length; i++){
            tasks[i] = ()-> System.out.printf("Hello!%n");
        }

        Thread thread = new Thread(runTasks(tasks));
        thread.run();

    }

    public static Runnable runTasks(Runnable[] tasks) {
        return () -> {
            for(Runnable task : tasks) {
                task.run();
            }
        };
    }
}
