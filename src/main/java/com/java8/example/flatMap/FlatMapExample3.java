package com.java8.example.flatMap;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample3 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\project-workspace\\event-mesh-latest\\JavaTest\\src\\main\\java\\com\\java8\\example\\common\\test.txt");
        // read file into a stream of lines
        Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);

        // stream of array...hard to process.
        // Stream<String[]> words = lines.map(line -> line.split(" +"));

        // stream of stream of string....hmm...better flat to one level.
        // Stream<Stream<String>> words = lines.map(line -> Stream.of(line.split(" +")));

        // result a stream of words, good!
        Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));

        // count the number of words.
        long noOfWords = words.count();

        System.out.println(noOfWords);  // 16
    }

}
