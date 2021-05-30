package com.java8.example.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample1 {

    public static void main(String[] args) {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String[]> stream1 = Arrays.stream(array);
        List<String> collect = Stream.of(array)
                .flatMap(Stream::of)
                .filter(x -> !"a".equals(x))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
