package com.proartz.Chapter5.Exercise3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import static com.proartz.Chapter5.Exercise2.App.sumOfValues;

public class App {

    public static void main(String[] args) {
        String filename = "numbers.txt";

        try {
            System.out.println(sumOfValues(filename));
        } catch (NoSuchFileException ex) {
            System.out.println(filename + " not found.");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("IOException error");
        }
    }
}
