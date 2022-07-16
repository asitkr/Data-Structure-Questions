package com.learn;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to chcek it is prime or not : ");
		int year = sc.nextInt();
		
		if (year%400 == 0) {
			System.out.println("Leap Year");
		}
		else if(year%100 == 0) {
			System.out.println("Leap Year");
		}
		else if(year%4 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("NO");
		}
	}

}
