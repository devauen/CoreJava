package com.proartz.Chapter5.Exercise4;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        double[] result = new double[1];
        result[0] = 0;

        int error = sumOfValues("numbers.txt", result);

        switch(error) {

            case 1:
            System.out.println(result[0]);
            break;

            case -1:
                System.err.println("Nieodnaleziono pliku");
                break;

            case -2:
                System.err.println("Błąd I/O");
                break;
        }


    }

    public static int readValues(String filename, ArrayList<Double> array) {

        try(Scanner in = new Scanner(Paths.get(filename), "UTF-8")) {

            while (in.hasNext()) {
                Double number = in.nextDouble();
                array.add(number);
            }


        } catch (NoSuchFileException ex) {
            return -1;
        } catch (IOException ex) {
            return -2;
        }
        return 1;
    }

    public static int sumOfValues(String filename, double[] result) {

        double sum = 0;
        ArrayList<Double> array = new ArrayList<>();
        int error = readValues(filename, array);
        if(error != 1) {
            return error;
        }

        for (double number : array) {
            sum += number;
        }

        result[0] = sum;

        return 1;
    }

}
