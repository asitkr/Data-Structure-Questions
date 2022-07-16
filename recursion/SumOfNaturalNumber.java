package com.recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which you want to sum : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		printNaturalNumber(i, n, sum);
		
		sc.close();
	}
	
	public static void printNaturalNumber(int i, int n, int sum) {
		if(i == n) {
			sum += i; 
			System.out.println(sum);
			return;
		}
		
		sum += i;
		printNaturalNumber(i+1, n, sum);
	}

}
