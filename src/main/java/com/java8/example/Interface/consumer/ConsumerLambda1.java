package com.java8.example.Interface.consumer;

import java.util.function.Consumer;

public class ConsumerLambda1 {
    public static void main(String[] args) {
        Consumer<Citizen> illegibleToVote = c->{
            if(c.getAge() <18)
                System.out.println(c.getName() + "not eligible for vote");
            else
                System.out.println(c.getName() + " is eligible for vote");
        };
        illegibleToVote.accept(new Citizen(17,"Subhjit"));
    }



}

class Citizen{
    private int age;
    private String name;

    public Citizen(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
