package com.basicstrong.characterstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReadingWritingThroughBuffers {

    public static void main(String[] args) throws IOException {
        char[] buffer = new char[10];

        FileReader reader = new FileReader("characterstreams/file.txt");
        FileWriter writer = new FileWriter("characterstreams/out.txt");

        int length;
        while((length = reader.read(buffer)) != -1) {
            writer.write(buffer, 0, length);
        }

        reader.close();
        writer.close();
    }
}