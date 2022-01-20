package com.basicstrong.section11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Lecture82 {

    private static String file = "D:/12E51121.bin";
    private static String fileGz = "D:/12E51121.gz";

    public static void main(String[] args) {

        byte[] buffer = new byte[8192];

        try {
            var in = new FileInputStream("D:/12E51121.bin");
            var out = new GZIPOutputStream(new FileOutputStream("D:/12E51121.gz"));

            int length;
            while((length =in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
