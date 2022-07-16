package com.strings;

import java.util.Arrays;

public class ReverseStringByKAndRotateWithK {

	public static void main(String[] args) {
		String str = "HiJulyCome";
		int k = 2;
		char[] arr = new char[str.length()];
		
		int i=k; int z = 0;
		while(i+(k-1) < arr.length) {
			char[] brr = new char[k];
			for(int j=0; j<k; j++) {
				brr[j] = str.charAt(i++);
			}
			
			for(int j=k-1; j>=0; j--) {
				arr[z++] = brr[j];
			}
			
		}
		
		while(i < str.length()) {
			arr[z++] = str.charAt(i++);
		}
		
		for(i=k-1; i>=0; i--) {
			arr[z++] = str.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
