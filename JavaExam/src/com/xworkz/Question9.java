package com.xworkz;

public class Question9 {

	
	static String a="abcabcbb";
	static String b="abcabcbb";
	
	static char[] k=a.toCharArray();
	
	public static void showResult()
	{
	for(int i=0;i<1;i++)
	{
		for(int j=1;j<a.length();j++)
		{
	if (k[i]==k[j])
	{
		System.out.println(" repeating word is found at index "+j+" the word repeating is " + k[j]);
	    break;
	}
	}
	}
	}
	public static void main(String[] args) {

		System.err.println("******");
		showResult();
		
	}

}
