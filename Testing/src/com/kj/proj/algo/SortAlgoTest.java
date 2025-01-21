package com.kj.proj.algo;

public class SortAlgoTest{
	public static void main(String[] args)
	{

		int[] arr= {1,2,4}; 
		Boolean result = checkSorted (arr);
		System.out.println(result);
	}

	public static boolean checkSorted (int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i]> arr[i+1])
				return false;
		}
		return true;

	}
}