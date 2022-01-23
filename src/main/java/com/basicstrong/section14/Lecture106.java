package com.basicstrong.section14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Lecture106 {

    public static void main(String[] args) throws IOException {
        Stream<Path> stream = Files.find(Path.of("section14/"), Integer.MAX_VALUE, (path, attribute) -> path.toString().endsWith(".txt"));
        stream.forEach(path -> {
            System.out.println(path.toAbsolutePath());
        });

    }
}
