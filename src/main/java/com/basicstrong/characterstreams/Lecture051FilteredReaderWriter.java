package com.basicstrong.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture051FilteredReaderWriter {

    public static void main(String[] args) throws IOException {
        var reader = new HashTagReader(new FileReader("characterstreams/hashtags.txt"));

        String hashtag;

        while ((hashtag = reader.readHashTag()) != null) {
            System.out.println(hashtag);
        }

        reader.close();
    }
}
