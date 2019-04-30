package com.proartz.Chapter3.Exercise10;

import java.io.File;
import java.io.FileFilter;

public class App {

    public static void main(String[] args) {

        if(args.length != 1) {
            System.out.printf("java App pathname please..%n");
            System.exit(-1);
        }

        File[] subdirectories = subDirectories(new File(args[0]));
        printDirectories(subdirectories);


    }

    public static File[] subDirectories(File pathname) {

//        File[] subdirectories = pathname.listFiles(file -> file.isDirectory());
        File[] subdirectories = pathname.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()) {
                    return true;
                }
                return false;
            }
        });

        return subdirectories;
    }

    public static void printDirectories(File[] directories) {
        for(File directory : directories) {
            System.out.println(directory);
        }
    }

}
