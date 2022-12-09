package com.xworkz;

public class Question6 {

	int a;
	
	public Question6(int a) {
		this.a = a;
	}

	public void showPattern()
	{
		for(int i=this.a;i>0;i--)
		{
		for(int j=i;j>0;j--)
		{
			System.out.print("*");
		}
		System.out.println();
		
			
		}
		
		System.out.print("");
	}
	
	public  void  showk2()
	{
	for(int i=0;i<this.a+1;i++)
	{
	for(int j=i;j>0;j--)
	{
		System.out.print("*");
	}
	System.out.println("");
	}
	}
	
	public static void main(String[] args) {

		Question6 abc = new Question6(7);
		
		abc.showPattern();
		abc.showk2();
		
		
		
	}

}

















