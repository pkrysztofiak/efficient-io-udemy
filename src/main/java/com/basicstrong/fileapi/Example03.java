package com.basicstrong.fileapi;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Example03 {

    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");

        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

        File file2 = new File("file2.txt");
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getCanonicalPath());
    }
}