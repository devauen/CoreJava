package com.proartz.Chapter3.Exercise10;

import java.io.File;
import java.io.FileFilter;

public class directoryFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()) {
            return true;
        }
        return false;
    }
}
