package com.proartz.Chapter1.Ch01E06;

import java.math.BigInteger;

public class App {

    public static void main(String[] args) {
        System.out.printf("factorial(1000)=%d%n", factorial(new BigInteger("10")));
    }

    public static BigInteger factorial(BigInteger arg) {
        if(arg.equals(BigInteger.ONE)) {
            return (BigInteger.ONE);
        } else {
            return arg.multiply(factorial(arg.subtract(BigInteger.ONE)));
        }
    }
}
