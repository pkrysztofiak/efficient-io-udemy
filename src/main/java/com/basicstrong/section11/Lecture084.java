package com.basicstrong.section11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Lecture084 {

    private static String file = "section011/archive.zip";

    public static void main(String[] args) throws IOException {
        write();

        System.out.println(Files.size(Paths.get(file)));



    }

    private static void write() {
        try (
                var zipOut = new ZipOutputStream(new FileOutputStream(file));
                var dataOut = new DataOutputStream(zipOut)) {
            zipOut.putNextEntry(new ZipEntry("bin/"));
            zipOut.putNextEntry(new ZipEntry("bin/file.bin"));
            for (int i = 0; i < 100_000; i++) {
                dataOut.write(i);
            }

            zipOut.putNextEntry(new ZipEntry("txt/"));
            zipOut.putNextEntry(new ZipEntry("txt/file.txt"));
            dataOut.writeUTF("Hello, world!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
