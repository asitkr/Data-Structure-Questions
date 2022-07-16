package com.learn;

import java.util.Scanner;

public class Divisibly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			if(i%7 == 0) {
				System.out.println(i);
			}
		}
	}

}
