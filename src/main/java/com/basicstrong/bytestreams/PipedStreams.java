package com.basicstrong.bytestreams;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class PipedStreams {

    public static void main(String[] args) throws IOException {
        PipedInputStream pipedIn = new PipedInputStream();
        PipedOutputStream pipedOut = new PipedOutputStream(pipedIn);

        Runnable write = () -> {
            try (InputStream fileIn = new FileInputStream("bytestreams/pipedstreams/file.txt")) {
                int b;
                int counter = 0;
                while ((b = fileIn.read()) != -1) {
                    pipedOut.write(b);
                    counter++;
                    System.out.println("Byte " + b + " wrote to pipe");
                    if (counter == 1024) {
                        System.out.println("1024");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Runnable read = () -> {
            try {
                int b;
                while ((b = pipedIn.read()) != -1) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Byte " + b + " read from pipe");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(write).start();
        new Thread(read).start();
    }
}
