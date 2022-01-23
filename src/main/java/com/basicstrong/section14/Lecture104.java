package com.basicstrong.section14;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;

public class Lecture104 {

    public static void main(String[] args) throws IOException {
        List<FileSystemProvider> providers = FileSystemProvider.installedProviders();
        System.out.println(providers);

        providers.get(0).getFileSystem(URI.create("file:///"));

        FileSystems.getFileSystem(URI.create("file:///"));

        //all 3 do the same
        FileSystem fileSystem = FileSystems.getDefault();

        System.out.println(fileSystem.getRootDirectories());

        Iterable<FileStore> fileStores = fileSystem.getFileStores();
        for (FileStore fileStore : fileStores) {
            System.out.println("name: " + fileStore.name() + ", type: " + fileStore.type() + ", block size: " + fileStore.getBlockSize());
        }


    }
}
