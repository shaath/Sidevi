package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] x=new Object[5];
		
		System.out.println(x.length);

//		System.out.println(x[2]);
		
		//Writing the data
		
		x[2]="Selenium";
		x[4]="Sridevi";
		
		x[2]="UFT";
//		x[5]="Sharath";
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		
	}

}
