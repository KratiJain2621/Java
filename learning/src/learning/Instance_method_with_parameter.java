//calling instance method in static method
//jis class k under method bnate h ushi ka obj hona chahiye static method m
package learning;
import java.util.Scanner;
public class Instance_method_with_parameter 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 
		int a ,b;
		Scanner sc = new Scanner (System.in); 
		a = sc.nextInt();
		b = sc.nextInt();
		Instance_method_with_parameter obj = new Instance_method_with_parameter();
         obj.disp(a,b);
         System.out.println("Krati Jain");
		
	}

	void disp(int a , int b)
	{
		
		int x = a;
		int y = b ;
		int z = x + y;
		
		System.out.println(z);
	}
}
