package com.proartz.Chapter2.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        /* nextInt jest metodą modyfikującą, ponieważ zmienia stan obiektu, na którym jest wywoływana
        * */

        Random random = new Random();
        int randomInteger = random.nextInt();
        /* nextInt jest metodą dostępową, ponieważ nie zmienia stanu obiektu, na którym jest wywoływana
        
         */
    }
}
