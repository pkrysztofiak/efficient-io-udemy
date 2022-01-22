package com.basicstrong.section14;

import java.nio.file.spi.FileSystemProvider;

public class Lecture104 {

    public static void main(String[] args) {

        System.out.println(FileSystemProvider.installedProviders());
    }
}
