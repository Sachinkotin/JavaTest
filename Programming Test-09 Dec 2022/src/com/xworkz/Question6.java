package com.xworkz;

public class Question6 {
	
	/*  6. Write a program to print the following design pattern
 			Input: number = 7
 			Output:
 			
	 			* * * * * * *
	 			 * * * * * *
	 			  * * * * *
	 			   * * * *
	 			    * * *
	 			     * *
	 			      *
	 			      *
	 			     * *
	 			    * * *
	 			   * * * *
	 			  * * * * *
	 			 * * * * * *
	 			* * * * * * */
				
	

	int a;

	public Question6(int a) {
		this.a = a;
	}

	public void showPattern() {{
		for (int i = 0; i < a; i++) {
			for (int j = i; j < a; j++) {
				System.out.print("* ");
			}
			System.out.println();
			for (int k = 0; k < i + 1; k++) {
				System.out.print(" ");
			}

		}
		
		System.out.println("");
	}
	
	for (int i = 0; i < a; i++) {
		
		for (int k = i+1; k < a; k++) {
			System.out.print(" ");
		}
		for (int j = 0; j < i+1; j++) {
			System.out.print("* ");
		}
		System.out.println();
		

	}
	
}

	
	public static void main(String[] args) {

		Question6 abc = new Question6(10);

		abc.showPattern();
		
		
	}

}
