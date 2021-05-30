package com.java8.example.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static char getFirstRepeatedChar(String str){
        Map<Character,Integer> counts = new LinkedHashMap<Character,Integer>(str.length());
        for(char c: str.toCharArray()){
            counts.put(c, counts.containsKey(c)? counts.get(c) + 1 :1);
        }
        for(Map.Entry<Character,Integer> entry : counts.entrySet()){
            if(entry.getValue()==1)
                return entry.getKey();
        }
        throw new RuntimeException("didn't find any repeated character");
    }
}
