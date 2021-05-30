package com.java8.example.comparator.comparable;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.getName());
    }

    public  static List<Student> getStudentList(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Ankit",37));
        list.add(new Student("Mohit",31));
        list.add(new Student("Sumit",25));
        return  list;
    }
}
