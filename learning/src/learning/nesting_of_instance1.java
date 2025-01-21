package learning;

public class nesting_of_instance1
{
	public static void main(String args[])
	{
		Test obj = new Test();
		obj.disp();
		
	}
}

class Test
{
	void disp()
	{
		Test1 ob = new Test1();
		int x = ob.add(); //calling instance method
		                  //inside Instance Method
		
		System.out.println("Addition= "+x);
	}
}

class Test1
{
	int add()
	{
		int a = 10,b = 20;
		int z = a +b;
		return z;
	}
}