package com.proartz.Chapter5.Exercise2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import static com.proartz.Chapter5.Exercise1.App.readValues;

public class App {

    public static void main(String[] args) throws IOException{

        System.out.println(sumOfValues("numbers.txt"));

    }

    public static double sumOfValues(String filename) throws IOException {

        double sum = 0;
        ArrayList<Double> numbers = readValues(filename);
        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }
}