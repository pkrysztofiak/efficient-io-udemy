package com.basicstrong.characterstreams;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class Lecture046ReadLine {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new FileReader("characterstreams/frankenstein.txt"));
        var writer = new BufferedWriter(new FileWriter("characterstreams/frankenstein_copy.txt"));

        Instant start = Instant.now();

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());

        reader.close();
        writer.close();
    }
}
