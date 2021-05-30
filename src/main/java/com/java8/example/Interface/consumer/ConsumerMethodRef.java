package com.java8.example.Interface.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerMethodRef {
    public static void main(String[] args) {
        Map<Integer, String> persons = new HashMap<Integer, String>();
        persons.put(101, "Mahesh");
        persons.put(102, "Krishna");

        Consumer<Map<Integer, String>> updatePersons = Utility::updateData;

        Consumer<Map<Integer, String>> displayPersons = Utility::displayData;

        updatePersons.accept(persons);

        displayPersons.accept(persons);
    }
}

class Utility{
    static void updateData(Map<Integer,String>persons){
        persons.replaceAll((k,v)->"Shree ".concat(v));
    }

    static void displayData(Map<Integer,String>persons){
        persons.forEach((k,v)-> System.out.println("Key : " +k +", Value :"+v));
    }
}

class Persons{
    private int id;
    private String name;

    public Persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
