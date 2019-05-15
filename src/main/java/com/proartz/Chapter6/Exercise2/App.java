package com.proartz.Chapter6.Exercise2;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        StackObject<Integer> stack = new StackObject<>();

        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }

}
