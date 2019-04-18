package com.proartz.Ch01E09;

public class App {

    public static void main(String[] args) {
        String str1 = new String("Test");
        String str2 = new String("Test");

        System.out.printf("Test == Test is %b%n", ("Test" == "Test"));
        System.out.printf("str1 == str2 is %b%n", str1 == str2);
        System.out.printf("str1.equals(str2) is %b%n", str1.equals(str2));
    }
}
