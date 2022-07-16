package com.learn;

import java.util.Scanner;

public class GCD_Divisior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int gcd = 1;
		
		for(int i=1; i<= m && i<=n; i++) {
			if(m%i == 0 && n%i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
