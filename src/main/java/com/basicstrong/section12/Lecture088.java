package com.basicstrong.section12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Lecture088 {

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("section12/file1.txt");
        Path path2 = Paths.get("section12", "file2.txt");

        //Added in Java 11 cause there were no static methods in
        //interfaces before
        Path path3 = Path.of("section12", "file3.txt");

        Path path = Path.of("section12", "file.txt");
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getFileSystem());

        System.out.println(path.toAbsolutePath());

        Path dir1 = Path.of("section12/dir1");
        Path dir2 = Path.of("section12/dir2");

        System.out.println(dir1.relativize(dir2));

        System.out.println("exists=" + Files.exists(path));
        System.out.println("hidden=" + Files.isHidden(path));
        System.out.println("readable=" + Files.isReadable(path));
        System.out.println("writeable=" + Files.isWritable(path));
        System.out.println("executable=" + Files.isExecutable(path));

        var in = Files.newBufferedReader(path);
        String line;
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }

        Files.lines(path).forEach(System.out::println);

        var out = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
        out.write("\nHello, unknown!");
        out.flush();

        Files.lines(path).forEach(System.out::println);

    }
}
