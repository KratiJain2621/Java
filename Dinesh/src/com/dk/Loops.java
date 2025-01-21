package com.dk;

public class Loops {
	static void printTable(int n)
	{
		for(int i = 1; i<=10 ; i++)
		{
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
	static void patternOneToN(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void printOddEven(int n)
	{
		if(n % 2 == 0)
			System.out.println("Even");
		else System.out.println("Odd");
	}
	static String getOddEven(int n)
	{
		if(n%2 == 0)
			return "Even";
		else return "Odd";
	}
	public static void main(String args[])
	{
		//Control D to dlete a line
		//a static method can call only other static methods
		printTable(7);
		patternOneToN(7);
		for(int n = 1; n<=10; n++)
		{
			System.out.print(n + " : ");
			printOddEven(n);
		}
		for(int n = 1; n<=10; n++)
		{
			System.out.println(n + " : " + getOddEven(n));
		}
		
		/*
		 * Print table of 7
		 * Fiboonicci series 15 terms to print
		 * 1 2 4 7 11 16 22 29    (37 terms)
		 * 3 5 6 10 9 15 12 20 15 25   (37 terms)
		 * 
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4 
		 * 1 2 3 4 5
		 * 
		 *  
		 *  5
		 *  5 4
		 *  5 4 3 
		 *  5 4 3 2 
		 *  5 4 3 2 1
		 * 
		 *  
		 *            5
		 *          4 5
		 *        3 4 5
		 *      2 3 4 5
		 *    1 2 3 4 5
		 *    
		 *    
		 *    
		 *                1
		 *              1 2 1
		 *            1 2 3 2 1 
		 *          1 2 3 4 3 2 1
		 *        1 2 3 4 5 4 3 2 1 
		 *        
		 *     factorial(int n) { }
		 *          
		 *    
		 */
		
	}
}
