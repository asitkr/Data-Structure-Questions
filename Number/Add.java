package com.learn;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number : ");
		int c = sc.nextInt();
		
		System.out.println("Sum of three number is : " + (a+b+c));
		
		sc.close();
	}

}
