package com.learn;

import java.util.Scanner;

public class AddThenMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second, Third, Sum=0;
		Scanner sc = new Scanner(System.in);
		first = sc.nextInt();
		second = sc.nextInt();
		Third = sc.nextInt();
		Sum = (first+second)*Third;
		System.out.println("Result is : " + Sum);
		sc.close();
	}

}
