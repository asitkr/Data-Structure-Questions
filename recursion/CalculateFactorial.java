package com.recursion;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calulate factorial : ");
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
		sc.close();
	}
	
	public static int factorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		
		int factorial_n_1 = factorial(n-1);
		int factorial_n = n * factorial_n_1;
		return factorial_n;
	}

}
