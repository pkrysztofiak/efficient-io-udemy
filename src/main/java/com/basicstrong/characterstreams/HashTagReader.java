package com.basicstrong.characterstreams;

import java.io.BufferedReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public class HashTagReader extends FilterReader {

    public HashTagReader(Reader in) {
        super(new BufferedReader(in));
    }

    public String readHashTag() throws IOException {
        String hashtag = "";
        int i;
        while ((i = in.read()) != -1) {
            char c = (char) i;
            if (c == '#') {
                hashtag += "#";
                hashtag += readWord();
                return hashtag;
            }
        }
        return null;
    }

    private String readWord() throws IOException {
        String word = new String();
        int i;
        while ((i = in.read()) != -1) {
            char c = (char) i;
            if (c != '\n' && c != ' ') {
                word += c;
            } else {
                break;
            }
        }
        return word;
    }

}
