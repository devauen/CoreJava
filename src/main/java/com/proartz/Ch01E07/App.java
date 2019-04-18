package com.proartz.Ch01E07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        short number1 = readNumber();
        short number2 = readNumber();

        System.out.println("number1 = " + Short.toUnsignedInt(number1));
        System.out.println("number2 = " + Short.toUnsignedInt(number2));

        short sum = (short) (number1 + number2);
        System.out.printf("unsignedSum(number1, number2) = %d%n", Short.toUnsignedInt(sum));

        short sub = (short) (number1 - number2);
        System.out.printf("unsignedSub(number1, number2) = %d%n", Short.toUnsignedInt(sub));

        short div = (short) (Short.toUnsignedInt(number1) / Short.toUnsignedInt(number2));
        System.out.printf("unsignedDiv(number1, number2) = %d%n", Short.toUnsignedInt(div));

        short mul = (short) (Short.toUnsignedInt(number1) * Short.toUnsignedInt(number2));
        System.out.printf("unsignedMul(number1, number2) = %d%n", Short.toUnsignedInt(mul));
    }

    public static short readNumber() {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        short number = 0;

        System.out.print("Enter integer: ");
        if(scanner.hasNextInt()) {
            input = scanner.nextInt();
        }

        number = (short) input;

        return number;
    }
}
