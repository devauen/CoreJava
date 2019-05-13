package com.proartz.Chapter5.Exercise10;

import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception{

        if(args.length != 1) {
            throw new Exception("Invalid arguments count");
        }

        int x = Integer.parseInt(args[0]);

        System.out.println("factorial(" + x + ")=" + factorial(x));

    }

    public static int factorial(int x) {
        if(x == 1){
            Exception ex = new Exception();
            StackTraceElement[] frames = ex.getStackTrace();
            Arrays.asList(frames).forEach(System.out::println);

            return x;
        }
        return (factorial(x - 1) * x);
    }

}
