package com.dk;

public class ArrayTwoDim {
	
	public static void main(String[] args) {
		int[][] a = new int[3][4];  
		//a00  a01   a02   a03
		//a10  a11   a12   a13
		//a20  a21   a22   a23
		int[][] b = new int[3][4];
		
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				a[i][j] = i+j;
			}
		}
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				System.out.println( a[i][j] + " " );
			}
			System.out.println();
		}
		
		a[0] = new int[6]; //first 1  D array in 2 D array.
		a[2] = new int[3];
		
		
		printArray(b);
		printArray(a);
		
		
		
	}

	private static void printArray(int[][] a) {
		for(int i = 0; i< a.length; i++)
		{
			for(int j = 0; j < a[i].length ; j++)
			{
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	static int[][] addMatrices(int[][] a, int[][] b)
	{
		return null;
	}

}
