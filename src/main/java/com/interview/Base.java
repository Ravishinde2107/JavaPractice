package com.interview;

import java.io.IOException;
import java.util.HashSet;

interface BaseInterface{
    int i=1;
}
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

    String str ="DerivedClass";
    public void print( String str){
        System.out.println("Derived print method str = "+str);
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

    String str ="BaseClass";
    public void print( String str){
        System.out.println("Base print method str = "+str);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return this;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Base b = new Derived();
        //BaseInterface.i=20; //cant assign value to final value
        b.print(b.str); // overrideing not apply on instance veriable

        //try{
            //throw 10;
       // }catch(int e){}  //Required Typeis throwable
        Base b1 = (Base) b.clone();
        b1.str="CloneClass";
        b.print(b.str);
        b1.print(b1.str);
        new HashSet<String>().add("");
    }
}