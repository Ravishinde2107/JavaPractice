package com.interview;

@FunctionalInterface
public interface Java8Interface {

    String abstractMethod();

    default  String defaultMethod(){
        return "";
    }

    static String staticMethod(){
        return "";
    }
}
