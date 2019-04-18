package com.proartz.Ch01E01;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int input = readInteger();

        System.out.printf("Binary %s%n", Integer.toString(input, 2));
        System.out.printf("Octal %s%n", Integer.toString(input, 8));
        System.out.printf("Hexadecimal %s%n", Integer.toString(input, 16));
        System.out.printf("Hexadecimal floating-point %a%n", (double)input);
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int integer = scanner.nextInt();

        return integer;
    }
}
