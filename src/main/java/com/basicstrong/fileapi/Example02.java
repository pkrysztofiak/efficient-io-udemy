package com.basicstrong.fileapi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Example02 {

    public static void main(String[] args) throws IOException {
        File file = new File("D:/test/file2.txt");

        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

        System.out.println("size: " + file.length() + "B");

        File directory = new File("D:/directory");

        System.out.println(directory.exists());
        directory.mkdir();
        System.out.println(directory.exists());

        for (int i = 0; i < 10; i++) {
            new File(directory, "directory" + i).mkdir();
            new File(directory, "file" + i + ".txt").createNewFile();
        }

        System.out.println(Arrays.toString(directory.list()));
        for (String child : directory.list()) {
            if (new File(directory, child).isDirectory()) {
                System.out.println(child);
            }
        }
    }
}