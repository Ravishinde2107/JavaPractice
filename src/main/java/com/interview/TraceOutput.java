package com.interview;

public class TraceOutput {
    public static void main(String[] args) {
        new Test1().method(null);

        int i=5;
        System.out.println(i+""+5);
    }
}

class Test1{
     public void method(Object object){
         System.out.println("Object");
     }

    public void method(String string){
        System.out.println("String");
    }

    //public void method(Integer i){
    //    System.out.println("Integer");
    //}

    public void method(int i){
        System.out.println("int");
    }

    public void method(double d){
        System.out.println("double");
    }

}