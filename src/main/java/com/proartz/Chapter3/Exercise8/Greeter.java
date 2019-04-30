package com.proartz.Chapter3.Exercise8;

public class Greeter implements Runnable {

    private int n = 0;
    private String target = "";

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for(int i = 0; i < n; i++) {
            System.out.printf("Witaj, %s%n", target);
        }
    }
}
