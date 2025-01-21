package learning;

public class Student 
{
	public static void main(String args[]) 
	{
	  Example obj = new Example ();
	  obj.a = 10;
	  obj.b = 20;
	  obj.add();
	  obj.sub();
	  System.out.println("Addition ="+obj.addition);
	  System.out.println("Subtract = "+obj.subtraction);
	}
}
	class Example
	{
		int a,b,addition,subtraction;
		void add()
		{
			addition = a+b;
		}
		
		void sub()
		{
		
			subtraction = a-b;
		}
	}
	

