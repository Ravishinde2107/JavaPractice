package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchList {

    static class Student{
        public String name;
        public int studentId;

        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", studentId=" + studentId +
                    '}';
        }
    }

    static class StudentComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.studentId == o2.studentId) && (o1.name.equals(o2.name))?0:-1;
        }
    }

    private static void print(Student student, int index){
        if(index < 0){
            System.out.println(student + " is not present in the list of students");
        }else {
            System.out.println(student + " is present in the list of students at index - " + index);
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("john",1006));
        studentList.add(new Student("keith",1004));
        studentList.add(new Student("donald", 1005));
        studentList.add(new Student("mac",1009));

        Student searchStudent = new Student("john",1006);
        int index = Collections.binarySearch(studentList, searchStudent, new StudentComparator());

        print(searchStudent, index);

        Student searchStudent1 = new Student("mac",1005);
        int index1 = Collections.binarySearch(studentList, searchStudent1, new StudentComparator());
        print(searchStudent1, index1);
    }
}