//package com.dk.interf;
//interface Figure
//{
//	//no data
//	public double area(); 
//}
//interface Picture
//{
//	public void draw();
//}
//
//class Rectangle implements Figure
//{
//	double len, wid;
//
//	public Rectangle(double len, double wid)
//	{
//		super();
//		this.len = len;
//		this.wid = wid;
//	}
//	public double area()
//	{
//		return len * wid;
//	}
//}
//class Circle implements Figure
//{
//	double rad;
//
//	public Circle(double rad)
//	{
//		super();
//		this.rad = rad;
//	}
//	public double area()
//	{
//		return Math.PI * rad * rad; 
//	}
//}
//public class FigureDemo
//{
//	public static void main(String[] args)
//	{
//		t
//		Rectangle r = new Rectangle(4,2);
//		Circle c = new Circle(8);
//		System.out.println(f.area());
//		System.out.println(r.area());
//		System.out.println(c.area());
////		System.out.println(f.len); Error
//		System.out.println(f.area());
//		double  s = getSumArea(f, r);
//		System.out.println("sum = " + s);
//		
//		s = getSumArea(r,c);
//		System.out.println("sum = " + s);
////		Figure figures[]  = new Figures[5];
//		/*
//		 * initalize the array with 1 figure, 2 rectabgles and 2 circles
//		 * call functions getSumArea for this array and print the answer
//		 */
//	}
//	private static double getSumArea(Figure f1, Figure f2)
//	{
//		return f1.area() + f2.area(); 
//		//RUN TIME POLYMORPHISM
//	}
//	private static double getSumArea(Figure[] figures)
//	{
//		//return the sum of area of all figures in the array
//		return 0;
//	}
//}