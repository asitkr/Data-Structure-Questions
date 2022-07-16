package com.learn;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second, Third, Product;
		Scanner sc = new Scanner(System.in);
		first = sc.nextInt();
		second = sc.nextInt();
		Third = sc.nextInt();
		Product = first*second*Third;
		
		System.out.println("Product of three number : " + Product);
		sc.close();
	}

}
