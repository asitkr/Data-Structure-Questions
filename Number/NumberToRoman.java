package com.self;

import java.util.*;

public class NumberToRoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n > 0 && n < 4000) {
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			
			map.put("M", 1000);
			map.put("CM", 900);
			map.put("D", 500);
			map.put("CD", 400);
			map.put("C", 100);
			map.put("XC", 90);
			map.put("L", 50);
			map.put("XL", 40);
			map.put("X", 10);
			map.put("IX", 9);
			map.put("V", 5);
			map.put("IV", 4);
			map.put("I", 1);
			
			StringBuilder sb = new StringBuilder();
			
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				while(n >= entry.getValue()) {
					n = n - entry.getValue();
					sb.append(entry.getKey());
				}
			}
			System.out.println(sb);
		}
		else {
			System.out.println("PLZ ENTER VALID NUMBER BETWEEN 1 TO 3999.... ");
		}
		
		sc.close();

	}

}
