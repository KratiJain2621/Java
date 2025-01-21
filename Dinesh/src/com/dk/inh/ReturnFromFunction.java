package com.dk.inh;
class MyPair
{
	public int first;
	public int second;
	public MyPair(int first, int second)
	{
		super();
		this.first = first;
		this.second = second;
	}
	
}
class Triplet extends MyPair
{
	public int third;

	public Triplet(int first, int second, int third)
	{
		super(first, second);
		this.third = third;
	}
	
	
}
public class ReturnFromFunction
{
	public static void main(String[] args)
	{
		Triplet t = new Triplet(3,4,6);
		int[] ar = { 324,3,54,5,6,5,54,6778,67,43,88, -4, -10, 34};
		MyPair ret = findMinMax(ar);
		int min = ret.first;
		int max = ret.second;
		System.out.println("min of array =" + min);
		System.out.println("max of array =" + max );
		
		//Base class reference = Derived class Object
		MyPair pr = new MyPair(3,3);
		Triplet tr=new Triplet(4,4,4);
		
		pr = tr;
//		tr = pr; //derived = base XXX ERROR
		
		
		System.out.println(pr.first + "," + pr.second);
		
	}

	private static MyPair findMinMax(int[] ar)
	{
		int min = ar[0];
		int max = ar[0];
		for(int i = 1; i<ar.length; i++)
		{
			if(ar[i]> max) max = ar[i];
			if(ar[i]< min) min = ar[i];
		}
		MyPair p = new MyPair(min,max);
		p.first = min;
		p.second = max;
		return p;
	}

}
