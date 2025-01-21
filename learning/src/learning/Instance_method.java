//calling instance method in static method
package learning;
import java.util.Scanner;
public class Instance_method {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         Instance_method obj = new Instance_method();
         obj.disp();
         System.out.println("Krati Jain");
		
	}

	void disp()
	{
		 Scanner obj = new Scanner (System.in);
		int a ;
		a = obj.nextInt();
		System.out.println(a);
	}
}
