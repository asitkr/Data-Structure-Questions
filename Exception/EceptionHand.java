package com.exception;

public class EceptionHand {

	public static void main(String[] args) {

		try {
			System.out.println(10/0);
		} 
		catch (ArithmeticException ae) {
			System.out.println("Divide by zero");
		} 
		catch (Exception e) {
			System.out.println("Without Error");
		}
	}

}
