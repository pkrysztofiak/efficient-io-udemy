package com.basicstrong.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileReaderAndFileWriter {

    public static void main(String[] args) throws IOException {
        System.out.println("Default charset " + Charset.defaultCharset());

        //Second argument is not needed cause default encoding is UTF-8
        Reader reader = new FileReader("characterstreams/file.txt", StandardCharsets.UTF_8);

        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char) c);
        }

        reader.close();
    }
}
