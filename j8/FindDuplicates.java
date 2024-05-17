package com.java8nb2;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,1,5,5);
        Set<Integer> set = new HashSet<>();
//        Set<Integer> result = new HashSet<>();
//        result = list.stream().filter(x-> !set.add(x)).collect(Collectors.toSet());
//        result.forEach(System.out::println);

        list.stream().filter(i-> Collections.frequency(list,i)>1).distinct()
                .forEach(System.out::println);
    }
}
