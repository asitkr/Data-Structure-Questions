package com.recursion;

public class FibonacSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		System.out.println(Fibnoacci(number));
	}
	
	public static int Fibnoacci(int number) {
		if(number == 0 || number == 1) {
			return number;
		}
		return Fibnoacci(number-1)+Fibnoacci(number-2);
	}

}
