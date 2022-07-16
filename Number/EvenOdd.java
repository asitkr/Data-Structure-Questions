package com.learn;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			if(i%2 == 0){
				System.out.print("even");
			}
			else {
				System.out.print("odd");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
