package com.basicstrong.fileapi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileAPI {

    public static void main(String[] args) throws IOException {
        File file = new File("D:/directory/file.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

        File directory = new File("D:/directory/inner");
        System.out.println(directory.exists());
        directory.mkdir();
        System.out.println(directory.exists());

        for (int i = 0; i < 10; i++) {
            File newFile = new File("D:/directory/inner/file" + i + ".txt");
            newFile.createNewFile();
        }

        for (int i = 0; i < 10; i++) {
            File newFile = new File("D:/directory/inner/directory" + i);
            newFile.mkdir();
        }

        System.out.println(Arrays.toString(directory.listFiles()));

        for (String filename : directory.list()) {
            System.out.println(filename);
            File savedFile = new File(directory, filename);
            System.out.println("name=" + filename + ", isFile=" + savedFile.isFile());
        }

        System.out.println("length=" + file.length());

        File path = new File("D:/directory/inner/../inner2");
        System.out.println("path=" + path.getPath());
        System.out.println("absolute=" + path.getAbsolutePath());
        System.out.println("canonical=" + path.getCanonicalPath());

    }
}
