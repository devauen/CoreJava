package com.proartz.Chapter3.Exercise12;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;

import static com.proartz.Chapter3.Exercise11.App.printFiles;

public class App {

    public static void main(String[] args) {

        if(args.length != 1) {
            System.out.println("App [pathname]");
            System.exit(-1);
        }

        File file = new File(args[0]);
        File[] files = file.listFiles();

        printFiles(files);
        System.out.println();

        Arrays.sort(files, compareFiles());
//                .comparing((File f)->f.isDirectory() ? -1 : 1)
//                .thenComparing(File::getName));

        printFiles(files);

    }

    public static Comparator<File> compareFiles() {
        return (File x, File y)->{
            if(x.isDirectory() == y.isDirectory()) {
                return x.getName().compareTo(y.getName());
            }

            return x.isDirectory()? -1 : 1;
        };
    }

}
