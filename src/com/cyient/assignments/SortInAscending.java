package com.cyient.assignments;

import java.util.Scanner;

public class SortInAscending {
	static void bubblesort(int []num) {
		int n = num.length;
		int temp=0;
		for(int i=0; i<n; i++) {
			for(int j=1; j < (n-i); j++){  
                if(num[j-1] > num[j]){  
                       //swap elements  
                       temp = num[j-1];  
                       num[j-1] = num[j];  
                       num[j] = temp;  
               }  
			
		}
		
	}
}
	public static void main(String[] args) {
		int [] num = new int[5];
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter number- ");
		for(int i=0; i<5; i++) {
			
			 
			num[i]=sc.nextInt();  
			
		
		}
		System.out.print("Array Element ");
		for(int i=0; i<5; i++) {
			
			 
			  
			System.out.print("  " + num[i]);
			bubblesort(num);
			System.out.println("Array After Bubble Sort");  
            for( i=0; i < num.length; i++){  
                    System.out.print(num[i] + " ");
		
		}
		
	}
		
	}
}
