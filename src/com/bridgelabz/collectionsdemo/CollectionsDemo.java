package com.bridgelabz.collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;


public class CollectionsDemo 
{
	
	

	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		doQueueDemo();
		

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
	private static void doStackDemo()
	{
		
		System.out.println("Stack demo: ");
		Stack<String> stack = new Stack<String>();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		String elementAtTop = stack.pop();
		
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
		
	}
	
	private static void doQueueDemo()
	{
		
		System.out.println("Queue demo: ");
		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("raj");
		queue.add("ram");
		queue.add("tam");

		System.out.println("Head : " + queue.element());
		System.out.println("Head : " + queue.peek());

		System.out.println("Queue Elememts  are : ");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}

		queue.remove();
		queue.poll();

		System.out.println(" after removing two elements : ");
		iterator = queue.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
	}
	

}
