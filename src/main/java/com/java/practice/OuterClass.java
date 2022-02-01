package com.java.practice;

 class OuterClass
{
    abstract static class InnerClassOne
    {
        abstract void test();
    }
 
    class InnerClassTwo
    {
        //Class as a non-static member
    }
}
 
//Extending Static inner class or static nested class
class AnotherClassOne extends OuterClass.InnerClassOne
{
    @Override
    void test() {

    }
    //static nested class can be referred by outer class name,
}
 
//Extending non-static inner class or member inner class
class AnotherClassTwo extends OuterClass.InnerClassTwo
{
    public AnotherClassTwo()
    {
        new OuterClass().super();  //accessing super class constructor through OuterClass instance
    }
}
