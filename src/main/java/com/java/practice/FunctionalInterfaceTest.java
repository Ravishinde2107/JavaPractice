package com.java.practice;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("1", "aaa", "d1", 20));
        list.add(new Employee("2", "bbb", "d2", 23));
        list.add(new Employee("3", "ccc", "d1", 25));
        list.add(new Employee("4", "ddd", "d3", 19));
        list.add(new Employee("5", "eee", "d1", 17));

        List<String> l = list.stream().filter(e -> e.getName().equals("aaa")).map(e -> e.getName()).collect(Collectors.toList());

        System.out.println(l);

        List<String> sort = list.stream().sorted((a1, a2) -> a1.getAge() - a2.getAge()).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(sort);

        Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(e -> e.getName(), Collectors.toList())));
        System.out.println(map);

        Comparator<Employee> comparator  = Comparator.comparing(Employee::getName, Comparator.reverseOrder());
        comparator = comparator.thenComparing(Employee::getId);
        comparator = comparator.thenComparing(Employee::getDepartment);
        list = list.stream().sorted(comparator).collect(Collectors.toList());

        System.out.println(list);

        List<Integer> listOfNumbers1 = Arrays.asList(1, 2, 3, 4);
        listOfNumbers1.stream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

        List<Integer> listOfNumbers2 = Arrays.asList(1, 2, 3, 4);
        listOfNumbers2.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );
    }
}
