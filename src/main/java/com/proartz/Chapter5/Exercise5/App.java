package com.proartz.Chapter5.Exercise5;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        copyFile("tekst1.txt", "tekst2.txt");

    }

    public static void copyFile(String input, String output) {
        try{

            Scanner in = new Scanner(Paths.get(input));
            PrintWriter out = new PrintWriter(output);

            while(in.hasNextLine()) {
                out.println(in.nextLine());
            }

            in.close();
            out.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
