//calling instance method in static method
package learning;
import java.util.Scanner;
public class Instance_method_returning_value 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         Test obj = new Test();
         System.out.println(obj.add());
         int r = obj.mult(5);
         System.out.println(r);
         System.out.println("Krati Jain");
		
	}
}

class Test
{
	int add()
	{
		int a ,b;
		Scanner sc = new Scanner (System.in); 
		a = sc.nextInt();
		b = sc.nextInt();
		return(a+b);
		
	}
	int mult(int p)
	{
	   int k = p;
	   return(k*k);
	}
}