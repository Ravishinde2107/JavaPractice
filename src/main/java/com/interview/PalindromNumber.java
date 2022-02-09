package com.interview;

public class PalindromNumber {
    public static void main(String[] args) {

        int num = 1221, reversedNum = 0;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            reversedNum = (reversedNum * 10) + (num % 10);
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
