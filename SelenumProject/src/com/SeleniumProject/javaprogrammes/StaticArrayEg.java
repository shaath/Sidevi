package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args)
	{
		String[] x={"Manual","Selenium","Sridevi","UFT"};
		
		//Finding the length of an array
		System.out.println(x.length);

		
		//Reading the data
//		System.out.println(x[2]);
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
	}

}
