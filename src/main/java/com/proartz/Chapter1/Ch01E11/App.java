package com.proartz.Chapter1.Ch01E11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String lineOfText = readLine();
        printAllNotAscii(lineOfText);

    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String lineOfText = "";

        System.out.print("Enter a line of a text: ");
        if(scanner.hasNextLine()) {
            lineOfText = scanner.nextLine();
        }

        return lineOfText;
    }

    public static void printAllNotAscii(String string) {
        int[] codePoints = string.codePoints().toArray();

        for(int codePoint : codePoints) {
            if(codePoint > 255) {
                System.out.printf("%c: u+%04d%n", codePoint, codePoint);
            }
        }
    }
}
