package com.basicstrong.bytestreams;

import java.io.*;

public class BufferedStreams {

    public static void main(String[] args) throws FileNotFoundException {


        try (InputStream in = new BufferedInputStream(new FileInputStream("bytestreams/bufferedstreams/file.txt"))) {
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }

        } catch (IOException e) {

        }

    }
}
