package com.learn;

public class FindFactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First method
//		int n = 28, count = 0;
//		for(int i=1; i<=n; i++) {
//			if(n%i == 0) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println(count);
		
		
		
		//Second Method
		int n = 28, count = 0;
		for(int i=1; i*i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
		
		
		
		//Third method
//		int n = 36, count = 0;
//		for(int i=1; i<=Math.sqrt(n); i++) {
//			if(n%i == 0) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println(count);
		
		
		
		int n1 = 28;
		int factor = 0;
		for(int i=1; i<=n1; i++) {
			if(n1%i == 0) {
				factor++;
			}
		}
		System.out.println(factor);
		
	}

}
