package com.basicstrong.section07objectstreams;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        var out = new ObjectOutputStream(new FileOutputStream("section07/employee2.bin"));
        out.writeObject(new Employee(23));
        out.close();
    }
}