package com.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91));
        studentList.add(new Student("Harish", 13, "History", 83));
        studentList.add(new Student("Xiano", 14, "Literature", 71));
        studentList.add(new Student("Soumya", 15, "Economics", 77));
        studentList.add(new Student("Asif", 16, "xsxszxqasAAC1XZB", 89));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84));
        studentList.add(new Student("Mitshu", 18, "History", 73));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92));
        studentList.add(new Student("Harry", 20, "History", 71));



        List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(top3Students);

        Map<String, Student> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Function.identity()));
        System.out.println(namePercentageMap);

        Map<String, Student> sortedMap =  namePercentageMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((o1, o2)-> o1.getPercentage()-o2.getPercentage()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        namePercentageMap.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2)-> o1.getPercentage()-o2.getPercentage()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue)->oldValue, LinkedHashMap::new));
        System.out.println(sortedMap);

        Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));

        System.out.println(studentspartionedByPercentage);

        Map<Integer, List<Student>> groupByName = studentList.stream().collect(Collectors.groupingBy(Student::getPercentage));
        System.out.println(groupByName);

        List<String> nameList= studentList.stream().map(a->a.getName()).collect(Collectors.toList());
        nameList.add("Paul");
        nameList.add("Zevin");
        nameList.add("Harish");
        System.out.println(nameList);
        nameList = nameList.stream().distinct().collect(Collectors.toList());
        System.out.println(nameList);


      Optional<Student> s = studentList.stream().collect(Collectors.maxBy(Comparator.comparing(e-> e.getPercentage())));

        System.out.println(s.get());

    }
}

class Student
{
    String name;

    int id;

    String subject;

    int percentage;

    public Student(String name, int id, String subject, int percentage)
    {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public String getSubject()
    {
        return subject;
    }

    public int getPercentage()
    {
        return percentage;
    }

    @Override
    public String toString()
    {
        return name+"-"+id+"-"+subject+"-"+percentage;
    }
}