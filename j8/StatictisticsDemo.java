package com.java8nb2;

import java.util.Arrays;
import java.util.List;

public class StatictisticsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,1,5,5);
        double avg = list.stream().mapToInt(x->x).summaryStatistics().getAverage();
        double sum = list.stream().mapToInt(x->x).summaryStatistics().getSum();
        double count = list.stream().mapToInt(x->x).summaryStatistics().getCount();
        double max = list.stream().mapToInt(x->x).summaryStatistics().getMax();
        double min = list.stream().mapToInt(x->x).summaryStatistics().getMin();
        System.out.println("Avg: " +avg + " Sum: "+sum+" Count: "+count+" Max: "+max+" Min: "+min);
    }
}
