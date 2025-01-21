package com.kj.proj.algo;
import java.util.*;
import java.lang.*;

public class KratiExtraction 
{
		public static int firstDigit(int n)
		{

			while (n >= 10)
				n /= 10;

			return n;
		}
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number");
			
			int n = sc.nextInt();
			System.out.println(firstDigit(n));
		}
	}



