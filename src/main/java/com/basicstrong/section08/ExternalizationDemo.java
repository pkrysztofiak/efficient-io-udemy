package com.basicstrong.section08;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExternalizationDemo {

    private static String filename = "section08/subtitles.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Subtitles subtitles = new Subtitles();

        serialize(subtitles, filename);

        Path path = Paths.get(filename);
        System.out.println("file size: " + Files.size(path));

        Subtitles deserialized = (Subtitles) deserialize(filename);
        System.out.println(deserialized);
    }

    private static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        var in = new ObjectInputStream(new FileInputStream(filename));
        Object object = in.readObject();
        in.close();
        return object;
    }

    private static void serialize(Subtitles subtitles, String filename) throws IOException {
        var out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(subtitles);
        out.flush();
        out.close();
    }
}