package com.SeleniumProject.javaprogrammes;

public class PolyndromeStringEg {

	public static void main(String[] args) 
	{
		String course="madam";
		
		String rev="";
		int len=course.length();
		
		for (int i = len-1; i >= 0; i--)
		{
			rev=rev+course.charAt(i);
		}
		
		if (course.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is a polyndrome");
		}
		else
		{
			System.out.println("Given String is not a polyndrome");
		}
	}

}
