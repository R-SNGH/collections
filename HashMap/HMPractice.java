package com.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HMPractice {
    public static void main(String[] args) {
        Map<Employee, Integer> map = new HashMap<>();
        Employee rach = new Employee("Rachita", 20, 156000.7);
        Employee anna = new Employee("Anna", 19, 96000.7);
        Employee pam = new Employee("Pam", 29, 86000.7);
        Employee zane = new Employee("Zane", 39, 80000.7);
        Employee tiger = new Employee("Tiger", 79, 0070.7);
        map.put(rach, 44);
        map.put(anna, 71);
        map.put(pam, 22);
        map.put(zane, 5);
        map.put(tiger, 15);

        Map<Employee, Integer> result =map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x,y)->y, LinkedHashMap::new));
        System.out.println(result);
    }
}
