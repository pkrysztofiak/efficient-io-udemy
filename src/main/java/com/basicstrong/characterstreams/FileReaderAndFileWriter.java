package com.basicstrong.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderAndFileWriter {

    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new FileReader("characterstreams/file.txt");
    }
}
