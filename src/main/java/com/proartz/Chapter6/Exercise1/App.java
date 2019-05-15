package com.proartz.Chapter6.Exercise1;

public class App {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for(int i = 0; i < 10; i++) {
            if(!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }
    }
}
