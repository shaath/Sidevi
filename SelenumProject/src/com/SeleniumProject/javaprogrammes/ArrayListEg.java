package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<String> x=new ArrayList<String>();
		
		x.add("Selenium");
		x.add("Kumar");
		x.add("samba");
		x.add("Sandeeep");
		x.add(2	, "Nidish");
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
			
		}

	}

}
