package com.cyient.assignments;

public class OddAndEven {

	public static void main(String[] args) {
		
		//1.Create a program to display odd and even results from 0 to 30. (using ,for loop,while)
			
		int [] num = new int[50];
		int i=0;
		
		for(i=0; i<31; i++) 
		{
			
			num[i] = i;
			num[i]++;
			
			while(num[i] % 2 == 0)
			{
				System.out.println("Even Result "      +num[i]);
				num[i]++;
			}
			
			while(num[i] % 2!= 0)
			{
				System.out.println("odd Result  "         +num[i]);
			num[i]++;
			}
			
			
		}
		
		

	}
	

}
