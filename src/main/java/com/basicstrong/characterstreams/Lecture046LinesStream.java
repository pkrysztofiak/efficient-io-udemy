package com.basicstrong.characterstreams;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

public class Lecture046LinesStream {

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new FileReader("characterstreams/frankenstein.txt"));

        Stream<String> stream = reader.lines();

        stream
                .filter(line -> line.contains("advantage"))
                .forEach(System.out::println);


        reader.close();
    }
}
