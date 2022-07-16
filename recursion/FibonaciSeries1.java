package com.recursion;

public class FibonaciSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		int n = 11;
		printFiboSeries(a, b, n-2);
	}
	
	public static void printFiboSeries(int a, int b, int n) {
		
		if(n == 0) {
			return;
		}
		
		int c = a+b;
		System.out.print(c + " ");
		printFiboSeries(b, c, n-1);
	}

}
