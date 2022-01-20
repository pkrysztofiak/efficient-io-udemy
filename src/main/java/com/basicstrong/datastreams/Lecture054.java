package com.basicstrong.datastreams;

import java.io.*;

public class Lecture054 {

    public static void main(String[] args) throws IOException {
        File file = new File("section06/file.txt");

        var out = new DataOutputStream(new FileOutputStream(file));
        int v = 696896766;
        System.out.println(Integer.toHexString(v));

        out.writeInt(v);

        var in = new FileInputStream(file);

        int i;
        while ((i = in.read()) != -1) {
            System.out.println(Integer.toHexString(i));
        }

        out.close();
        in.close();


    }
}
