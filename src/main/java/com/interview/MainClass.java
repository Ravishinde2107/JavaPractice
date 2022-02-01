package com.interview;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MainClass {
    long n = 3;
    static long result = 1;

    public static void main(String[] args) {

        boolean result1 = method("test", "ttew");
        System.out.println(result1);
        replaceAllZeroWithOne(82302300);
        fact(5);
        System.out.println("fact ="+ result);

        Object obj1;
        Object obj2;
    }
    public static void replaceAllZeroWithOne(int num){
        int num1 = Integer.parseInt(String.valueOf(num).replaceAll("0","1"));
        System.out.println("Input="+num);
        System.out.println("Output="+num1);


    }

    static long fact(long n){

        if(n<=1){
            return result;
        }
        else{
            result = result * n;
            fact(n-1);
        }
        return result;
    }

    public static boolean method(@NotNull String str1, @NotNull String str2){
        char[] strch1 = str1.toCharArray();
        char[] strch2 = str2.toCharArray();

        if(str1.length() != str2.length() )
            return false;
        Integer lenght = str1.length();
        Integer count=0;
        HashMap<Character, Integer> strMap1 = new HashMap<>();
        for(Character c : strch1){
            if(strMap1.containsKey(c)){
                count = strMap1.get(c);
            }else{
                count =0;
            }
            strMap1.put(c, count++);
        }
        count=0;
        HashMap<Character, Integer> strMap2 = new HashMap<>();
        for(Character c : strch2){
            if(strMap2.containsKey(c)){
                count = strMap2.get(c);
            }else{
                count =0;
            }
            strMap2.put(c, count++);
        }

        for(Character c : strch2){
            if(strMap1.get(c) != strMap2.get(c))
                return false;
        }

        return true;

    }
}
