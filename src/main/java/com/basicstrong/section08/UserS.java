package com.basicstrong.section08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserS {

    public static void main(String[] args) throws IOException {
        System.out.println(new Exception());

        var out = new ObjectInputStream(new FileInputStream("file.txt"));
    }
}
