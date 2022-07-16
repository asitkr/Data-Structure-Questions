package com.learn;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		switch (number) {
			case 1: System.out.println("Yoy have Entred number is : " + number);
			break;
			
			case 2: System.out.println("Yoy have Entred number is : " + number);
			break;
			
			case 3: System.out.println("Yoy have Entred number is : " + number);
			break;
			
			case 4: System.out.println("Yoy have Entred number is : " + number);
			break;
			
			case 5: System.out.println("Yoy have Entred number is : " + number);
			break;
			
			default: System.out.println("Sorry you have entered none of these numbers ");
			break;
		}
		
		sc.close();
	}

}
