package com.basicstrong.section08;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.IOException;
import java.util.regex.Pattern;

@State(Scope.Benchmark)
public class SimpleBench {

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }

    private String input = "key=value";
    private Pattern pattern = Pattern.compile("=");

    @Benchmark
    public String[] benchOne() {
        return input.split("=");
    }

    @Benchmark
    public String[] benchTwo() {
        return pattern.split(input, 2);
    }
}
