package com.java8nb2;

import java.util.stream.IntStream;

public class IsPrime {

    public static boolean isPrimeNumber(int number){
        return number>1 && IntStream.range(2,number).noneMatch(n->number%n ==0);
    }
    public static void main(String[] args) {
        int num = 34;
        System.out.println("The Number" + num + "Is Prime? Java8 Method: "+isPrimeNumber(num));
    }
}
