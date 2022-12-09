package com.xworkz;

public class Question8 {

	int a;
	

	public void showPattern()
	{
		for(int i=0;i<22;i++)
		{
			System.out.print("*");
		
		}
		
		System.out.println("");
	}
	
	public void showPattern2()
	{
	 int a=22;
	 
	 for(int j=0;j<6;j++)
	 {
	 System.out.print("*");
	 for (int i=0;i<a-2;i++)
	 {
		 System.out.print(" ");
	 }
	 System.out.print("*");
	 System.out.println("");
	 }
		
	
	}
	
	
	
	
	public static void main(String[] args) {

		
		Question8 gh = new Question8();
		gh.showPattern();
		gh.showPattern2();
		gh.showPattern();
		
	}

}
