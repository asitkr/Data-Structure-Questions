package com.learn;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int temp = num;
		int rem, rev=0;
		
		while(temp != 0) {
			rem = temp%10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		if(num == rev) {
			System.out.println(num + " Palindrome number");
		}
		else {
			System.out.println(num + " Not a palindrome number");
		}
	}

}
