package com.basicstrong.fileapi;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class Example01 {

    public static void main(String[] args) throws URISyntaxException {

        File f1 = new File("D:/test/");
        File f2 = new File(f1, "file1.txt");

        File f3 = new File("D:/test/", "file1.txt");

        File f4 = new File(new URI("file:/D:/test/file1.txt"));

        System.out.println(f4.exists());
    }
}
