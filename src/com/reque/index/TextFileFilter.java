package com.reque.index;

import java.io.FileFilter;
import java.io.File;

public class TextFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname){
        return pathname.getName().toLowerCase().endsWith(".txt");
    }
}
