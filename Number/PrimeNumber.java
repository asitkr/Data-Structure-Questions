package com.learn;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		for(int i=2; i<=n; i++) {
			int factor = 0;
			for(int j=1; j*j<=i; j++) {
				if(i%j == 0) {
					int factor1 = j;
					int factor2 = i/factor1;
					factor++;
					
					if(factor1 != factor2) {
						factor++;
					}
				}
			}
			
			if(factor == 2) {
				System.out.println("Prime Number : " + i);
			}
		}
	}

}
