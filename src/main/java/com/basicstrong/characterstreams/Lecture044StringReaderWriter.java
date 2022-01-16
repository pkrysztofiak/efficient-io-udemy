package com.basicstrong.characterstreams;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

public class Lecture044StringReaderWriter {

    public static void main(String[] args) throws IOException {
        String message = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?\n"
                + "He would chuck, he would, as much as he could, and chuck as much wood\n"
                + "As a woodchuck would if a woodchuck could chuck wood";

        Reader reader = new StringReader(message);
        StringWriter writer = new StringWriter();

        char[] buffer = new char[3];

        while((reader.read(buffer)) != -1) {
            writer.write(buffer);
        }

        System.out.println(writer.toString());
    }
}
