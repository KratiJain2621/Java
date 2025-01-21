package com.dk;

import com.dk.model.Point;

//package : to put related classes at one place (folder)
//Date is class : java.util.Date    java.sql.Date 

//class Point
//{
//	int x, y;
//	//class name start with Capital
//	//method name : small letter
//	// constant : ALL CAPITAL 
//	
//	//CamelCase FirstDemo ArrayIndexOutOfBoundsException
//	//sonarlint plugin eclipse 
//	//sonarqube server to which submit code, standards not followed
//	//code is returned
//	//method 
//	//there can only be 0 or 1 public class in a file
//	//file name = public class name
//}
//class Rational 
//{
//	
//
//	
//}
//class Student
//{
//	
//}
public class Hello {
	
	public static void main(String args[])
	{
			
		Point p = new Point();
		System.out.println("Hello Guardians !!!");
		
		printSum(4,5);
//		Data types
		boolean b = false;
		b = true;
		byte bt = 23; //one byte data 8 bits -127 to +128
		char ch = 'A'; //all lang store a char in unicode format ascii 8bits 
		//2 bytes data 
		ch = 65; 
		short sh  = 65; //2 bytes
		int i = 28; //4 bytes -2 billion to +2 billion
		long l = 29; //8 bytes of data
		float f = 3.4f; //c and c++ is also error 4 bytes
		double d = 3.4; // 8 bytes 
		
//		ch = i;
		
		i = ch;
		if(i > 100)
		{
			System.out.println("yes large");
		}
		else
		{
			System.out.println("no small");
		}
		for(int j = 1; j<=100; j++)
		{
			System.out.println(j);
		}
		//Control+Space help autocompletion / shortcuts/ suggestions
		//Contorl+1  : Error related help : hover mouse
		
	}
	public static void printSum(int a, int b)
	{
		System.out.println(a + b);
	}
	
}
//given to compiler Hello.class  after compiling I get .exe .class HDD
//Hello.class will be executed by Java interpreter 
//
