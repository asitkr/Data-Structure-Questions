package com.recursion;

public class CalulactePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		int result = calcPower(x, n);
		System.out.println(result);
	}
	
	public static int calcPower(int x, int n) {
		// 1st base case
		if(n == 0) {
			return 1;
		}
		
		// 2nd base case
		if(x == 0) {
			return 0;
		}
		
		int power_n_1 = calcPower(x, n-1);
		int power = x * power_n_1;
		return power;
	}

}
