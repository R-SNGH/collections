package com.java8nb2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Hi Hi There There You Hi ARE ARE ARE Beautiful Hi";
        System.out.println("Counting Frequency... ");
        List<String>  words = Arrays.asList(sentence.split(" "));
        Map<String, Long> resultmap = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(resultmap);
        System.out.println("Printing Duplicate words... ");
        resultmap.entrySet().stream().filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        System.out.println("Printing Words with single occurrence... ");
        resultmap.entrySet().stream().filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
