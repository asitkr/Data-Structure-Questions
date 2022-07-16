package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		sb.reverse();
//		String str = sc.next();
//		
//		String s = "";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			s += str.charAt(i);
//		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
