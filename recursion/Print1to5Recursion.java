package com.recursion;

public class Print1to5Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		printNumber(n);
	}
	
	public static void printNumber(int n) {
		if(n == 10) {
			return;
		}
		
		System.out.print(n + " ");
		printNumber(n+1);
	}

}
