package com.recursion;

import java.util.Scanner;

public class Print1To5UsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a number to print n to 1 number : ");
		int n = sc.nextInt();
		printNumber(n);
		
		
		sc.close();
	}
	
	public static void printNumber(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.print(n + " ");
		printNumber(n-1);
	}

}
