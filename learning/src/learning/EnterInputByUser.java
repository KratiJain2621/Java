
package learning;
import java.util.Scanner;
public class EnterInputByUser
{
   public static void main (String args[])
   {
	   int number;
	   float num;
	   String str , str1;
	   Scanner obj = new Scanner (System.in);
	   System.out.print("Enter String");
	   str = obj.nextLine();
	   System.out.println(str);
	   
	   System.out.print("Enter String");
	   str1 = obj.next();
	   System.out.println(str1);
	   
	   System.out.println("Enter Integer");
	   number = obj.nextInt();
	   System.out.println(number);
	   
	   System.out.println("Enter Float");
	   num = obj.nextFloat();
	   System.out.println(num);
     
   }
}
