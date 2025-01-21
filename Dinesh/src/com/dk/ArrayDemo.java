package com.dk;

public class ArrayDemo {
	static void printLength(int[] a)
	{
		System.out.println("the length of given arrray =" + a.length);
	}
	static void printArray2(int br[])
	{
		//for (let x of br) console.log(x) in javascript
		
		for(int x : br ) //for every x in the array br
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}

	static void printArray(int br[])
	{
		for(int i = 0; i<br.length; i++)
		{
			System.out.print(br[i] + " ");
		}
		System.out.println();
	}
	static int[] getHalfArrayOfSum(int a[])
	{
		int len = a.length/2;
		int[] b = new int[len];
		for(int k = 0; k<b.length; k++)
		{
			b[k]  = a[2*k] + a[2*k+1];
		}
		return b;
	}
	
	public static void main(String args[]) {
		int[] ar = new int[10];
		printLength(ar);
		
//		int ar[] = new int[10];
		int [] br = { 23,34,23,3,56,34,23,54,56,67,56,3,2,23,34,5,87,6453,5};
		//every ar.length
		printArray(br);
		
//		int a[10]; //it wass array in c, c++
		//1. write a function to print the array
		//2. write a function to print the array in reverse order
		//3. write a function to print the oddd elements from the array
		//4. write a function to create one more array of half length 
		//that contains the sum of consecutive elemnts
		// 4 5 6 7 2 4 7 83 5 3 7 2 6 9 44 
		//  9  13  6    90    8  9  15  44
		// static int[] getHalfArrayOfSum(int[] ar)
		/*   k      2k     2k + 1
		 * b[0] = a[0] + a[1]
		 * b[1] = a[2] + a[3]
		 * b[2] = a[4] + a[5]
		 * b[3] = a[6] + a[7]
		 * 
		 * b[k] = a[2*k] + a[2*k + 1]
		 * 
		 */
		
		
		
		
	}

}
