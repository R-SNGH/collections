package com.java8nb2;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByScenarios {
    public static void main(String[] args) {
        Employee e1 =new Employee("Z", 30,764832);
        Employee e2 =new Employee("R", 13,7673);
        Employee e3 =new Employee("M", 33,928);
        Employee e4 =new Employee("B", 13,20000);
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);


        System.out.println("Creating a map with Key = Age, Value= List of Employees in that age group: ");

        Map<Integer, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(map);

        Map<Integer, Set<Employee>> grouped = employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.toSet()));
        System.out.println("Grouped into a specific Collection: set: ");
        System.out.println(grouped);

        Map<Integer, Set<Employee>> groupedAndSorted = employees.stream().collect(Collectors.groupingBy(Employee::getAge, TreeMap::new ,Collectors.toSet()));
        System.out.println("Grouped into a specific Collection and sorted: ");
        System.out.println(groupedAndSorted);




    }
}
