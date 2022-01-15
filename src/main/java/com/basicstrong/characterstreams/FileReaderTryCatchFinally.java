package com.basicstrong.characterstreams;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class FileReaderTryCatchFinally {

    public static void main(String[] args) {

        Reader reader = Reader.nullReader();
        try {
            reader = new FileReader("characterstreams/file.txt", StandardCharsets.UTF_8);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}