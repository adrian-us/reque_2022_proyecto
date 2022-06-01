package com.reque.index.controlador;

import java.io.FileFilter;
import java.io.File;

public class TextFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname){
        String extension = pathname.getName().toLowerCase();
        return (extension.endsWith(".txt") || extension.endsWith(".xml"));
    }
}
