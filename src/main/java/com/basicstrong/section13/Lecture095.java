package com.basicstrong.section13;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Lecture095 {

    public static void main(String[] args) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.putInt(1);
        buffer.putInt(2);

        System.out.println("Cursor: " + buffer.position());
        System.out.println("Limit: " + buffer.limit());

        buffer.flip();

        System.out.println("Cursor: " + buffer.position());
        System.out.println("Limit: " + buffer.limit());

        Path path = Path.of("section13/file.bin");
        FileChannel writeChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        writeChannel.write(buffer);

        FileChannel readChannel = FileChannel.open(path, StandardOpenOption.READ);
        buffer.clear();
        readChannel.read(buffer);
        readChannel.close();

        buffer.flip();

        try {
            while (true) {
                System.out.println(buffer.get());
            }
        } catch (BufferUnderflowException e) {

        }
    }
}