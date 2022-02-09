package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestCommonStringInArray {
    static boolean maxFound = false;
    public static void main(String[] args) {
        String[] arr = {"Apple","eAppe","Apphet","Applot"};

        Integer minlenth =Integer.MAX_VALUE;
        String minString ="";
        for (String s:arr) {
            if(s.length()<minlenth){
                minString=s;
                minlenth=s.length();
            }
        }
      System.out.println( getMaxCommonSring(arr, minString, true));
    }

    public static String getMaxCommonSring(String[] arr, String minString, boolean isLeft){
        boolean isfound =true;
        Integer start=0, end=minString.length();
        while(minString.length()!=0){

            for (String s:arr) {
                if(!s.contains(minString)){
                    isfound = false;
                    if(!maxFound) {
                        if(isLeft) {
                            minString = minString.substring(start, end - 1);
                            getMaxCommonSring(arr, minString, false);
                        }else{
                            minString = minString.substring(start+1, end);
                            getMaxCommonSring(arr, minString, true);
                        }
                    }
                    break;
                }
            }
            if(isfound){
                maxFound=true;
                return minString;
            }
            if(maxFound) {
                break;
            }
        }
        return minString;
    }
}
