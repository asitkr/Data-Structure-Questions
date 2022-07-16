package com.recursion;

import java.util.Scanner;

public class Print1To5 {

	public static void main(String[] args) {
		
		// Using normal iteration
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to 1 to n : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		sc.close();
	}

}
