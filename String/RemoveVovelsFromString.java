package com.string;

import java.util.Scanner;

public class RemoveVovelsFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != 'A' && str.charAt(i) != 'a' && str.charAt(i) != 'E' && str.charAt(i) != 'e' && str.charAt(i) != 'I' && str.charAt(i) != 'i' && str.charAt(i) != 'O' && str.charAt(i) != 'o' && str.charAt(i) != 'U' && str.charAt(i) != 'u') {
				s += str.charAt(i);
			}
		}
		
		System.out.println(s);
		
		sc.close();
	}

}
