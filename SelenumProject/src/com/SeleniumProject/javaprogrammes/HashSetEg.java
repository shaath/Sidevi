package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args)
	{
		Set<Object> s=new HashSet<Object>();
		
		s.add("Selenium");
		s.add(60000);
		s.add(true);
		s.add('M');
		s.add(4444.44);
		s.add("boll");
		s.add("Nidish");
		s.add('M');
		
		Iterator<Object> it=s.iterator();
		
		while(it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

}
