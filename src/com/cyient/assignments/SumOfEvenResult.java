package com.cyient.assignments;

public class SumOfEvenResult {

	public static void main(String[] args) {
		//3.	Create a program to display sum of even results find the result and check whether it is odd or even? (Range is 0 to 50)
		int sum=0;
		int [] num = new int[52];
		int i;
		for( i=0; i<=50; i++) {
			
			if(i%2==0) {
				num[i]=i; 
				System.out.println("           Even Result" +num[i]);
				sum=sum+i;
				}
			
			else {
				num[i]=i;
				System.out.print("odd Result" + num[i]);
			}
			
		
	}
		System.out.print(" sum of even results    "+sum);
	}

}
