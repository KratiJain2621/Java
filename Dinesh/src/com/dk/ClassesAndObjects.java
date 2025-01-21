package com.dk;

import java.util.Scanner;

import com.dk.model.Point;

public class ClassesAndObjects {
	
	public static void main(String[] args) {
		//control + / 
//		Scanner sc = new Scanner(System.in); //System.out Console output : Screen
//		//System.in : console input : keyboard Scan from keyboard
//		int x, y; //basic data types
//		System.out.println("enter two integers");
//		x = sc.nextInt();
//		y = sc.nextInt();
//		int z= x + y;
//		System.out.println("sum = " + z);
//		
//		//read 5 points from keyboard and print them.
//		int[] allx = new int[5];
//		int[] ally = new int[5];
//		
//		System.out.println("enter 5 points");
//		for(int i = 0; i<5; i++)
//		{
//			//3 4    5 3   1 2    6 7    4 4
//			allx[i] = sc.nextInt();
//			ally[i]= sc.nextInt();
//		}
//		for(int i = 0; i<5; i++)
//		{
//			//3 4    5 3   1 2    6 7    4 4
//			
//			System.out.println(" (" + allx[i] + "," + ally[i] + ") ");
//		}
		
		Point p = new Point(3,4); //object of Point has memory call to constructor 
		p.x = 5; p.y = 3;
		p.show();
		
		Point p2 = new Point(34,34);
		Point p3 = new Point(6,3);
		Point p4 = new Point(6,3);
		
		p2.show(); p3.show(); p4.show();
		p2.x= 34; p2.y = 34;
		p3.x= 99; p3.y = 383;
		p4.x= 33; p4.y = 2;
		p2.show(); p3.show(); p4.show();
		
		p = p2;
		System.out.println("now p values " + p.x + "," + p.y);
		p.x = 700;
		System.out.println(p2.x);
		Point pt= new Point();
		Point pt2 = new Point(6,5);
		
		System.out.println("distanc of p from origin " + p.distance());
		
		Point[] ptar = new Point[5];
		ptar[0] = p;
		ptar[1] = p2;
		ptar[2] = p;
		ptar[3] = p2;
		ptar[4] = p3;
		
		//Create a function that creates and array reads from kbd and
		//returns an array of 5 points 
		//write a function to proint this array
		
		Point[] arpt = getArrayOfPoints();
		printArrayOfPoints(arpt);
		//sscanf("%d%d", &x, &y);
		//read integers from a string "23 34 45 46 56345 456"
		
		
	}

	private static void printArrayOfPoints(Point[] arpt) {
		// TODO Auto-generated method stub
		for(int i = 0; i<arpt.length; i++)
		{
			System.out.println(arpt[i].x + "," + arpt[i].y);
		}
		
	}

	private static Point[] getArrayOfPoints() {
		Scanner sc = new Scanner(System.in);
		Point[] ar = new Point[5];
		//ar is not array of Point (ar is array of references)
		//
		System.out.println("enter 5 points");
		for(int i = 0 ; i<5; i++)
		{
			ar[i] = new Point();
			ar[i].x  = sc.nextInt();
			ar[i].y  = sc.nextInt();
			
		}
		sc.close();
		return ar;
		
		
	}

}
