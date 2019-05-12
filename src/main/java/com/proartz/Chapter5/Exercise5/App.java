package com.proartz.Chapter5.Exercise5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        copyFile("tekst1.txt", "tekst2.txt");

    }

    public static void copyFile(String input, String output) {
        try {
            Scanner in = new Scanner(Paths.get(input));
            try {
                PrintWriter out = new PrintWriter(output);
                try {
                    while (in.hasNextLine()) {
                        out.println(in.nextLine());
                    }
                } catch (Exception ex) {
                    System.out.println("Problem with reading nextLine");
                }
                try {
                    in.close();
                    out.close();
                } catch (Exception ex) {
                    System.out.println("Problem with closing resources");
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File " + output + " not found");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
