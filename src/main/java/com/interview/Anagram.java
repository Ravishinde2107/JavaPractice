package com.interview;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("result1= "+ checkAnagram("MARY",""));
        System.out.println("result2= "+ checkAnagram("RAVI","SHIDNDE"));
        System.out.println("result3= "+ checkAnagram("AAAAAABBBBBB","BBBBBBAAAAAA"));
        System.out.println("result4= "+ checkAnagram("",""));

    }

    static boolean checkAnagram(String s1, String s2){

        if(s1 == null || s2 == null){
            return false;
        }

        if(s1.length()!= s2.length()){
            return false;
        }

        HashMap<Character, Integer> S1CharCountMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> S2CharCountMap = new HashMap<Character, Integer>();
        char[] s1CharArr = s1.toCharArray();
        char[] s2CharArr = s2.toCharArray();

        for(int i =0; i<s1CharArr.length; i++){
            if(S1CharCountMap.containsKey(s1CharArr[i])){
                S1CharCountMap.put(s1CharArr[i], S1CharCountMap.get(s1CharArr[i])+1);
            }else{
                S1CharCountMap.put(s1CharArr[i], 1);
            }
            if(S2CharCountMap.containsKey(s2CharArr[i])){
                S2CharCountMap.put(s2CharArr[i], S2CharCountMap.get(s2CharArr[i])+1);
            }else{
                S2CharCountMap.put(s2CharArr[i], 1);
            }
        }
        for(int i =0; i<s1CharArr.length; i++){
            if(S2CharCountMap.get(s1CharArr[i]) == null){
                return false;
            }
            else if(S1CharCountMap.get(s1CharArr[i])!= S2CharCountMap.get(s1CharArr[i])){
                return false;
            }
        }
        return true;
    }
}
