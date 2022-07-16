package com.exception;

import java.util.Scanner;

public class InputException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNumber = sc.nextInt();
		
		try {
			int result = firstNumber/secondNumber;
		} catch (Exception e) {
			System.out.println("Divide by zero getting Exception");
		}
		
		sc.close();
	}
}
