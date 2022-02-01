package com.interview;

import java.util.Scanner;
class JavaExample { 

    public static double squareRoot(int number) {
	double temp;
	System.out.println("0:number="+number);
	double sr = number / 2;
	System.out.println("1:sr="+sr);
	do {
		temp = sr;
		System.out.println("2:temp="+temp);
		sr = (temp + (number / temp)) / 2;
		System.out.println("3:sr="+sr);
		System.out.println("4:number="+number);
	} while ((temp - sr) != 0);

	return sr;
    }

    public static void main(String[] args)  
    { 
	System.out.print("Enter any number:");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt(); 
	scanner.close();

	System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
    } 
}