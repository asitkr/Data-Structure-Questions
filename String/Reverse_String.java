package com.string;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
        	rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        
        sc.close();
	}

}
