package com.bridgelabz.collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class CollectionsDemo 
{
	
	

	public static void main(String[] args) {

		doListDemo();
		

	}

	private static void doListDemo() 
	{
		System.out.println("List demo:");
		List<String> list = new LinkedList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
		
	}
	

}
