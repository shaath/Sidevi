package com.SeleniumProject.javaprogrammes;

public class InterfaceReuseEg {

	public static void main(String[] args) 
	{
//		InterfaceImplements im=new InterfaceImplements();
//		im.vehicle();
		
//		InterfaceImplementsEg2 im2=new InterfaceImplementsEg2();
//		im2.vehicle();
		
		InterfaceEg im=new InterfaceImplements();
		im.vehicle();
		
		InterfaceEg im2=new InterfaceImplementsEg2();
		im2.vehicle();

	}

}
