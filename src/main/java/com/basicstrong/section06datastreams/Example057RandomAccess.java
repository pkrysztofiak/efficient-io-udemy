package com.basicstrong.section06datastreams;

import java.io.*;
import java.lang.reflect.Field;

public class Example057RandomAccess {

    public static void main(String[] args) throws IOException {

        File file = new File("section06/file.bin");
        var out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        int[] ints = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < ints.length; i++) {
            out.writeInt(ints[i]);
        }
        out.close();

        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

        randomAccessFile.seek(4);
        randomAccessFile.writeInt(22);

        randomAccessFile.seek(5 * 4);
        randomAccessFile.writeInt(66);

        randomAccessFile.seek(3 * 4);
        randomAccessFile.writeInt(44);
        randomAccessFile.close();

        var in = new DataInputStream(new FileInputStream(file));

        try {
//            while (true) {
//                System.out.println(in.readInt());
//            }
            for (int i = in.readInt(); ; i = in.readInt()) {
                System.out.println(i);
            }
        } catch (IOException e) {

        }
    }
}