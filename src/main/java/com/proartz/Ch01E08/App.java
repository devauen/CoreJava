package com.proartz.Ch01E08;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String line = readLine();
        System.out.println("String is: " + line);
        printSubstrings(line);
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String line = "";

        System.out.print("Enter a String: ");
        if(scanner.hasNextLine()) {
            line = scanner.nextLine();
        }

        return line;
    }

    public static void printSubstrings(String string) {
        for(int i = 0; i < string.length(); i++) {
            for(int j = i + 1; j <= string.length(); j++) {
                System.out.println(string.substring(i, j));
            }
        }
    }
}
