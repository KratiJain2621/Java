package com.dk.inh;

class Point
{
	int x,y;
	public void show() {
		System.out.println(" Point with " + x + "," + y);
	}
	public Point(int x, int y)
	{
		System.out.println("Point constructor");
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	
}
class Point3d extends Point
{
	//add on behaviour
	int z;
	public Point3d()
	{
//		super();
		//super must be 1st stmt in constructor
		super(0,0); //super constructor of base class/super class
		System.out.println("Point3d constructor");
		z = 0;
	}
	public int getZ()
	{
		return z;
	}

	public void setZ(int z)
	{
		this.z = z;
	}
	public void show3d()
	{
		System.out.println(" Point3d with " + x + "," + y+ "," + z);
	}
}


public class PointUse
{
	public static void main(String[] args)
	{
		Point p1 = new Point(0,0); //Point constructor
		Point3d p2 = new Point3d(); // Point constructor Point3d Constructor
		p1.x = 2; p1.y = 8;
		
		p2.x = 23; p2.y = 32; p2.z = 44;
		
		p1.show();
		p2.show3d();
		
		p2.show();
	}
}