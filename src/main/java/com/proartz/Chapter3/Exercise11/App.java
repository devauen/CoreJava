package com.proartz.Chapter3.Exercise11;

import java.io.File;

public class App {

    public static void main(String[] args) {

        if(args.length != 2) {
            System.out.println("App [pathname] [extension]");
            System.exit(-1);
        }

        printFiles(listFiles(args[1], new File(args[0])));

    }

    public static File[] listFiles(String extension, File pathname) {

        return pathname.listFiles(file -> file.getName().contains(extension));

    }

    public static void printFiles(File[] files) {

        for(File file : files) {
            System.out.println(file);
        }

    }

}
