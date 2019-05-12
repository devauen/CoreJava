package com.proartz.Chapter5.Exercise6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NestedTries {

    public static void main(String[] args) {

        BufferedReader in = null;
        String filename = "tekst1.txt";

        try {
            in = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8);
            while(in.ready()) {
                System.out.println(in.readLine());
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.err.println("Przechwycony wyjątek: " + ex.getMessage());
                }
            }

        } catch (IOException ex){
            System.err.println("Przechwycony wyjątek: " + ex.getMessage());
        }
    }
}
