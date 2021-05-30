package com.java8.example.flatMap;

import com.java8.example.common.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
* flatMap example – Find all books.
* */

public class FlatMapExample2 {
    public static void main(String[] args) {

        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);

        // hmm....Set of Set...how to process?
        /*Set<Set<String>> collect = list.stream()
                .map(x -> x.getBook())
                .collect(Collectors.toSet());*/

        Set<String> collect =
                list.stream()
                        .map(x -> x.getBook())                              //  Stream<Set<String>>
                        .flatMap(x -> x.stream())                           //  Stream<String>
                        .filter(x -> !x.toLowerCase().contains("python"))   //  filter python book
                        .collect(Collectors.toSet());                       //  remove duplicated

        Set<String> collect2 = list.stream()
                //.map(x -> x.getBook())
                .flatMap(x -> x.getBook().stream())                 //  Stream<String>
                .filter(x -> !x.toLowerCase().contains("python"))   //  filter python book
                .collect(Collectors.toSet());


        collect.forEach(System.out::println);

    }

}