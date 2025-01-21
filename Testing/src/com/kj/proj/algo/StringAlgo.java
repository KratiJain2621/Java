package com.kj.proj.algo;

public class StringAlgo {
	
		 public String shiftbytwo(String str)
		    {
		    	String first = str.substring(0, 2);
		    	String end = str.substring(2);
		    	String ans = end+ first;
		    	return ans;
		    }
			
			public static void main(String[] args)
			{
				StringAlgo obj = new StringAlgo();
				System.out.println(obj.shiftbytwo("Hello"));
				System.out.println(obj.shiftbytwo("program"));
				System.out.println(obj.shiftbytwo("ab"));
			}
		// TODO Auto-generated method stub

	}


