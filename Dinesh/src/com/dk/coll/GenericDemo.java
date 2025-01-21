package com.dk.coll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

interface Comparable<T>
{
	int compareTo(T obj);
}

class Stack<T>
{
	T[] a;
	int top = -1;
	public void push(T item)
	{
	}
	T pop()
	{
		return a[top--];
	}
}

class Pair<T>
{
	T first;
	T second;
	public Pair(T first, T second)
	{
		super();
		this.first = first;
		this.second = second;
	}
	@Override
	public String toString()
	{
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
}
public class GenericDemo
{
	public static void main(String[] args)
	{
		//contorl shift O
		//Control 1
		//Control space
		List<String> list = new ArrayList<>();
		list.add("Ajay");
		list.add("Sumit");
		list.add("Rishi");
		list.add("Rahul");
		list.add("Dev");
		list.add("Ajay");
		list.add("Sumit");
		list.add("Rishi");
		list.add("Rahul");
		
		list.sort(new Comparator<String>()
			{

				@Override
				public int compare(String o1, String o2)
				{
					return o1.length() - o2.length();
				}
			}
		);//the elements are sorted as per string length
		
		
		printList(list);
		//insert in between
		list.add(1, "Parshant"); //shift all other begind
		printList(list);
		printListRev(list);
		
		printList(list);
		list.remove(1);
		printList(list);
		
		boolean contains = list.contains("Jagdeesh");
		System.out.println(contains);
		 contains = list.contains("Rahul");
		System.out.println(contains);
		
		int pos = list.indexOf("Rahul");
		System.out.println("postion of Rahul = " + pos);
		
		removeAlternates(list);
		//Ajay  Sumit  Rishi  Rahul  Dev  Ajay  Sumit  Rishi  Rahul
		//Ajay   Rishi   Dev   Sumit  Rahul
		
		printDuplicates(list);
		//Ajay  Sumit  Rishi  Rahul  Dev  Ajay  Rahul Rahul Rahul
		//Ajay Rahul 
		
//		List<int> marks = new ArrayList<>(); //list of basic data type not allowed
		List<Integer> marks = new ArrayList<>();
		for(int i = 30; i<50; i++)
			marks.add(i);
		marks.add(34);
		marks.add(65);
		marks.add(20);
		System.out.println(marks.toString());
//		removeFailures(marks); //all elements less than 40 marks to be remvoed
		
		marks.removeIf(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t)
			{
				return t<40;
			}} );
		
		System.out.println(marks.toString());
		
		
	}

	private static void removeFailures(List<Integer> marks)
	{
		// 0 1 2 3 
		// 3 5 4 5 6 7 8
		// 5 4 5 6 7 8
//		for(int i = 0; i<marks.size(); i++)
//		{
//			if(marks.get(i) < 40)
//			{
//				marks.remove(i);
//				i--;
//			}
//		}
		for(int i =marks.size()-1; i>=0 ;i--)
		{
			if(marks.get(i) < 40)
			{
				marks.remove(i);
			}
		}
	}

	private static void printDuplicates(List<String> list)
	{
		// TODO Auto-generated method stub
		
	}

	private static void removeAlternates(List<String> list)
	{
		// TODO Auto-generated method stub
		
	}

	private static void printListRev(List<String> list)
	{
		int n = list.size();
		for(int i = n-1; i>=0; i--)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
	}

	private static void printList(List<String> list)
	{
		//read an element get
		for(int i = 0; i<list.size(); i++)
		{
			String name = list.get(i);
			System.out.print(name + "  ");
		}
		System.out.println();
		
		//Iterable
//		for(String str : list)
//		{
//			System.out.print(str + " ");
//		}
//		System.out.println();
//		
//		list.forEach(x -> System.out.print(x + " "));
//		System.out.println();
		
	}

}










