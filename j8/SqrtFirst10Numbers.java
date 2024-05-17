package com.java8nb2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SqrtFirst10Numbers {
    public static void main(String[] args) {
        List<Double> result = Stream.iterate(1, i->i+1)
                .filter(IsPrime::isPrimeNumber)
                .map(Math::sqrt)
                .limit(10)
                        .toList();

        result.forEach(System.out::println);
    }
}
