package com.SeleniumProject.javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) 
	{
		String name="Sridevi";
//		String rev="";
//		int len=name.length();
		
//		for (int i = len-1; i >= 0; i--)
//		{
//			rev=rev+name.charAt(i);
//		}
//		System.out.println(rev);
		
		StringBuffer s=new StringBuffer(name);
		System.out.println(s.reverse());
	}

}
