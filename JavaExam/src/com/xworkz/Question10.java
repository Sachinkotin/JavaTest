package com.xworkz;

public class Question10 {

	
	static int a[] = {1,4,5,9,10};
	static int b[] = {2,8,6,1,7,4};
	
	public static void showCommonElements()
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {

		showCommonElements();
		
	}

}
