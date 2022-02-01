package com.java.practice;

public class TrickyInterface extends TestClass1.StaticInnerClass{

    public static void main(String[] args) {
       // TestInterface1 testInterface1= new TestClass1();
        //testInterface1.testMethod();
        //System.out.println(testInterface1.age);

        TestClass2 testClass2= new TestClass1();
        System.out.println(testClass2.age);

        TestClass1.StaticInnerClass st = new TestClass1.StaticInnerClass();
        st.StaticInnerMethod();
    }
}

class TestClass1 extends TestClass2 {

    int age =10;

    @Override
    public String testMethod() {
        return "Test Method Call";
    }
     static class StaticInnerClass{

        public String StaticInnerMethod() {
            return "StaticInner Method Call";
        }
    }

}

class TestClass2 implements TestInterface1, TestInterface2{

    int age =20;

    public String testMethod() {
        return "Test Method Call";
    }

    @Override
    public String defaultMethos() {
        return TestInterface1.super.defaultMethos();
    }
}

interface TestInterface1{
    int age =5;
    String testMethod();

    default String defaultMethos(){
        return "default Method Call";
    }
}

interface TestInterface2{
    String testMethod();

    default String defaultMethos(){
        return "default Method Call";
    }
}