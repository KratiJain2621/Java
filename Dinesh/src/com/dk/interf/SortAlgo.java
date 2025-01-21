package com.dk.interf;

import java.util.Arrays;
interface Compare
{
	int difference (Object o1, Object o2);
}

//Comparable Comparator

//23 34 45 565 63 4
//23 - 34 -ve 1st small
//565- 63 =ve 1st large
//0 equal
class Emp implements Comparable<Emp>
{
	int empid;
	String name;
	int age;
	public Emp(int empid, String name, int age)
	{
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Emp [empid=" + empid + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Emp o)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class SortAlgo
{
	public static void sort(Object[] a, Compare comp)
	{
		//bubble sort
		for(int i = a.length-1 ; i >= 0 ; i--)
		{
			for(int j = 0; j<i; j++ )
			{
				if(comp.difference(a[j] , a[j+1]) > 0 )
				{
					Object temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Emp e0 = new Emp(4, "Dinesh", 34);
		Emp e1 = new Emp(56, "Ashish", 32);
		Emp e2 = new Emp(2, "Divesh", 24);
		Emp e3 = new Emp(67, "Ajay", 21);
		Emp e4 = new Emp(28, "Rahul",23);
		Emp[] ar = new Emp[5];
		ar[0] = e0;
		ar[1] = e1;
		ar[2] = e2;
		ar[3] = e3;
		ar[4] = e4;
		ar[5] = e4;
		
		
		Arrays.sort(ar); //by comparable
//		Arrays.sort(ar,comp); //by comparator
		
//		sort(ar);
		int[] a = { 10,2,45,23,546,34,65,87,56,2,45,234,556,7,5,65,34523};
//		sort(a ,(i,j) -> { return ((Integer)i) - ((Integer)j) ; } );
		System.out.println(Arrays.toString(a));
	}

}
