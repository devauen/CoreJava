package com.proartz.Chapter5.Exercise1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException, InputMismatchException {

        readValues("numbers.txt").forEach(System.out::println);

    }

    public static ArrayList<Double> readValues(String filename) throws IOException, InputMismatchException {

        Scanner in = new Scanner(Paths.get(filename), "UTF-8");
        ArrayList<Double> doubles = new ArrayList<>();

        while(in.hasNext()) {
            Double number = in.nextDouble();
            doubles.add(number);
        }

        in.close();
        return doubles;
    }

}
