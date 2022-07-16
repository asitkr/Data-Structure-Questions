package com.learn;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second, Third;
		Scanner sc = new Scanner(System.in);
		first = sc.nextInt();
		second = sc.nextInt();
		Third = sc.nextInt();
		//Sum = (first+second)-Third;
		System.out.println("Result is : " + ((first+second)-Third));
		sc.close();
	}

}
