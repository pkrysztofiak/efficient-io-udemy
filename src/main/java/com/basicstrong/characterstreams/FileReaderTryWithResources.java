package com.basicstrong.characterstreams;

import java.io.*;

public class FileReaderTryWithResources {

    public static void main(String[] args) {

        try (PushbackReader reader = new PushbackReader(new FileReader("characterstreams/file.txt"), 2);
             Writer writer = new FileWriter("characterstreams/info.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                if ((char) c == '*') {
                    int c1 = reader.read();
                    int c2 = reader.read();
                    if ((char)c1 == '*' && (char)c2 == '*') {
                        break;
                    } else {
                        reader.unread(c2);
                        reader.unread(c1);
                    }
                }
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
