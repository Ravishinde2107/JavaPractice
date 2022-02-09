package com.interview;

import java.io.IOException;


class Derived extends Base{
    // public final void printData(){} -- Cant override final method

    // retrun type - only same or subclass allowed
    // Exception - only same or subclass allowed with any unchecked exception
    // same or increase visibility protected to public, cant reduce
    public String ExceptionMethod() throws IOException, InterruptedException, NullPointerException{
        System.out.println("Derived ExceptionMethod method");
        return "";
    }

    public static void staticMethod(){
        System.out.println("Derived staticMethod method");
    }

    int i =20;
    public void print(int i){
        System.out.println("Derived print method i = "+i);
    }
}

public class Base {
    public final void printData(){
        System.out.println("Base PrintData method");
    }

    protected Object ExceptionMethod() throws Exception {
        System.out.println("Base ExceptionMethod method");
        return 0d;
    }

    public static void staticMethod(){
        System.out.println("Base staticMethod method");
    }

    int i =10;
    public void print(int i){
        System.out.println("Derived print method i = "+i);
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.print(b.i); // overrideing not apply on instance veriable
    }
}