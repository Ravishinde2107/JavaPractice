package com.interview;

public class SuperThisUseCases {
    public static void main(String[] args) {

    }
}

class Parent{

    public Parent(){
        System.out.println("Parent Default Constructor");
    }

    public Parent(String arg){
        System.out.println("Parent arg Constructor");
    }
}

class Child{

    public Child(){
        this("arg");
        System.out.println("Child Default Constructor");
        //this("arg")  // this or super must be first statemnt
    }

    public Child(String arg){
        this("arg1","arg2");
        System.out.println("Child arg Constructor");
    }

    public Child(String arg1, String arg2){
       // this("arg1"); // recursive constructir not allowed
        System.out.println("Child arg Constructor");
    }
}