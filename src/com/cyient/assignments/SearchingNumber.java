package com.cyient.assignments;

import java.util.Scanner;

public class SearchingNumber {
	static int count=0;
	static int x;
	public static int search(int []num, int x) {
		int n = num.length;
		//int count=0;
		for(int i=0; i<n; i++) {
			
			
			if(num[i]==x) {
				
				count=count+1;
				return count;
				
		}
			else {
			return -1;
			}
			
	}
		return count;
	
}
	public static void main(String[] args) {
		int [] num = new int[5];
		
		
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter number- ");
		for(int i=0; i<5; i++) {
			
			 
			num[i]=sc.nextInt();  
			
		
		}
		System.out.print("Array Element ");
		for(int i=0; i<=5; i++) {
			
			 
			  
			System.out.print("  " + num[i]);
			
			Scanner sc1= new Scanner(System.in);
			System.out.print("Number of occurance ");
			x=sc1.nextInt();
			int result = search(num, x);
			if (result == -1)
	            System.out.print("Element is not present in array");
	        else
	            System.out.print("Element is present at index " + result);
		
		
		}
		
	}

}

