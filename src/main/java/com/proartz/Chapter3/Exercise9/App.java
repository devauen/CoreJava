package com.proartz.Chapter3.Exercise9;

import com.proartz.Chapter3.Exercise8.Greeter;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Greeter[] greeters = new Greeter[10];
        for(int i = 0; i < greeters.length; i++) {
            greeters[i] = new Greeter(10, "task" + i);
        }

//        runTogether(greeters);
        runInOrder(greeters);
    }

    public static void runTogether(Runnable... tasks) {

        List<Runnable> list = Arrays.asList(tasks);
        list.forEach(task->new Thread(task).run());
//        for(Runnable task : tasks) {
//            new Thread(task).run();
//        }
    }

    public static void runInOrder(Runnable... tasks) {
//        List<Runnable> list = Arrays.asList(tasks);
//        list.forEach(Runnable::run);
        for(Runnable task : tasks) {
            task.run();
        }
    }

}
