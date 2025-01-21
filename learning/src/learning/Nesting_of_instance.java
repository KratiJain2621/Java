package learning;

public class Nesting_of_instance
{

	public static void main(String[] args) 
	{
        Test obj = new Test();
        obj.disp();
		// TODO Auto-generated method stub
	}
}
	
class Test
{
	int add()       //instance method
	{
		int a = 10,b = 20;
		int z = a +b;
		return z;
		}
		void disp()   //instance method
		{
			int x = add();
			System.out.println("Addition = "+x);
		}
	}


