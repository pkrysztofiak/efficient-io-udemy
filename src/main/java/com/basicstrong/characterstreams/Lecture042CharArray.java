package com.basicstrong.characterstreams;

import java.io.*;
import java.util.Arrays;

public class Lecture042CharArray {

    public static void main(String[] args) throws IOException {

        String message = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?\n"
                + "He would chuck, he would, as much as he could, and chuck as much wood\n"
                + "As a woodchuck would if a woodchuck could chuck wood";

        char[] chars = message.toCharArray();

        var reader = new CharArrayReader(chars);
        var writer = new CharArrayWriter();

        char[] buffer = new char[4];

        while((reader.read(buffer)) != -1) {
            writer.write(buffer);
        }

        char[] out = writer.toCharArray();
        System.out.println(Arrays.toString(out));

        reader.close();
        writer.close();
    }
}