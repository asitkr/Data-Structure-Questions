package com.recursion;

import java.util.Scanner;

public class NewtonClass {
	public static void main (String[] args) {
        // Your code here
		//Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		for(int i=1; i<=t; i++){
			int n = 3;
			int k = 2;
//			
			System.out.println(remaining(n, k));
//		}
	}
	
	public static int remaining(int n, int k) {
		int r = 0;
		for (int i = 2; i <= n; i++)
			r = (r + k) % i;
		
		return r+1;
	}
}