package com.java8.example;

import com.java8.example.comparator.comparable.Student;

import java.util.List;

public class CompareDemoImplementLambda {
    public static void main(String[] args) {

        List<Student> list = Student.getStudentList();

        System.out.println(">>>Sort by name");
        list.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
        list.forEach(s-> System.out.println(s));


        System.out.println(">>>Sort by age");
        list.sort((s1,s2)->s1.getAge()-s2.getAge());
        list.forEach(s-> System.out.println(s));
    }
}
