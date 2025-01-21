package com.dk.coll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//FUNCTIONAL INTERFACE : interface with one method to override
//other methods are default / Static

interface Calc
{
	int add(int a, int b);
}
class MyCalc implements Calc
{
	@Override
	public int add(int a, int b)
	{
		return a + b;
	}
}

public class LambdaDemo
{
	public static void main(String[] args)
	{
		Calc calc = new MyCalc();

		Calc cal1 = new Calc() {
			@Override
			public int add(int a, int b)
			{
				return a + b;
			} 
		};
		Calc cal2 = (int a, int b)	-> { return a + b; };
		Calc cal3 = (a, b)	-> { return a + b; };
		Calc cal4 = (a, b)	-> a + b ;
		
		System.out.println(cal4.add(5, 6));
		
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = new LinkedList<>();
		
		for(int i = 1; i<= 30 ;i++)
		{
			list.add(i);
		}
		System.out.println(list.toString());
		list.removeIf(new Predicate<Integer>()
		{

			@Override
			public boolean test(Integer t)
			{
				// TODO Auto-generated method stub
				return t%3 == 0 ;
			}
		});
		list.removeIf(t -> t%3==0);
		System.out.println(list.toString());

		List<String> list2 = new ArrayList<>();
		list2.add("Ajay");
		list2.add("Sumit");
		list2.add("Rishi");
		list2.add("Rahul");
		list2.add("Dev");
		list2.add("Ajay");
		list2.add("Sumit");
		list2.add("Rishi");
		list2.add("Rahul");

		list2.sort(new Comparator<String>()
		{

			@Override
			public int compare(String o1, String o2)
			{
				return o1.length() - o2.length();
			}
		}
				);
		list2.sort((o1,o2)->
		{
			return o1.length() - o2.length();
		});
		list2.sort((o1,o2)-> o1.length() - o2.length() );
		System.out.println(list2.toString());
		
		
		List<Integer> marks = new ArrayList<>();
		for(int i = 30; i<50; i++)
			marks.add(i);
		marks.add(34);
		marks.add(65);
		marks.add(20);
		System.out.println(marks.toString());
		marks.forEach( new Consumer<Integer>()
		{
			@Override
			public void accept(Integer t)
			{
				System.out.println("marks anonymous = " + t);
			}
		});
		marks.forEach( ( t)->
		{
			System.out.println("marks = " + t);
		});
		marks.forEach(t-> System.out.println("marks = " + t) );
		marks.forEach(System.out::println );
		
		
//		list2.forEach(/* lambda to print name = name with length = 4"*/);
		list2.forEach(str -> 
			System.out.println("name = " + str + " with length = " + str.length() ));
//		list2.removeif(remove all names that start with A)
		list2.removeIf(t -> t.startsWith("A"));
		list2.removeIf(t -> t.charAt(0) == 'A');
		
		
		List<Customer> clist = new ArrayList<>();
		clist.add(new Customer(234, "Sumit Gupta", "Delhi"));
		clist.add(new Customer(238, "Rajan", "Delhi"));
		clist.add(new Customer(236, "Krishna", "Mumbai"));
		clist.add(new Customer(249, "Akshay", "Delhi"));
		clist.add(new Customer(258, "Aman", "Kanpur"));
		clist.add(new Customer(251, "Rishi", "Chennai"));
		
		//sort using names
//		clist.sort(null);
		clist.sort( (c1, c2) -> c1.getName().compareTo(c2.getName()) );
		clist.forEach(System.out::println);
		
		 //sort using custid
		clist.sort( (c1, c2) -> c1.getCustid() - c2.getCustid() );
		clist.forEach(System.out::println);
		
//		clist.remove(0); //remove all from Delhi
		clist.removeIf(c -> c.getAddress().contains("Delhi"));
		System.out.println();
		clist.forEach(System.out::println);

	}
}
/*
 * class ArrayList<T> implements List<T> { public void sort(Comprator<T> obj) {
 * for(int i = 1; i> size(); i++) { for(j = 0 j<i; j+=_) { if(obj.compare(a[j],
 * a[j+1]) > 0) { swpa(a, j, j+1); } } } } }
 */


/*
 * javascript
 * fun( callback)
 * {
 *   do some job here
 *   callback(res);
 *  }
 *  
 *  Java
 *  fun( Interface obj)
 *  {
 *  	do some job
 *  	obj.functionName(result);
 *  }
 *  list.sort(Comparator obj)
 *  {
 *  	do some job
 *  	obj.compare(a[j], a[j+1])
 *  }
 *  
 *  
 *  
 */