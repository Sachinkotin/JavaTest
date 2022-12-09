package com.xworkz;

public class Question3 {
	
	/* 3. Java code to separate odd and even numbers in an array
 			Input : {20,37,58,69,99,70,87,18,9}
 			Output : even= {20,58,70,18} , odd = {37,69,99,87,9}   */

	static int a[] = {20,37,58,69,99,70,87,18,9};
	
	public static void showEven()
	{
		System.err.println("Even elements are :");
		for(int i : a)
			if(i%2==0)
				System.out.print(i+" ");
	}
	

	public static void showOdd()
	{
		System.out.println();
		System.err.println("Odd elements are :");
		for(int i : a)
			if(i%2==1)
				System.out.print(i+" ");
	}
	
	
     
	
	public static void main(String[] args) {

		showEven();
		showOdd();
		
	}

}
