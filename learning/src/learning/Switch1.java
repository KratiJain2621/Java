
package learning;
import java.util.Scanner;
public class Switch1 
{
	public static void main(String args[])
	{
	int n;
	Scanner obj = new Scanner (System.in);
	System.out.println("Enter any Number for exit press 8");
	do
	{
	n = obj.nextInt();
	switch(n)
	{
	case 1:
	{
		System.out.println("Monday");
		break;
	}
	
	case 2:
	{
		System.out.println("Tuesday");
		break;
	}
	
	case 3:
	{
		System.out.println("Wednesday");
		break;
	}
	case 4:
	{
		System.out.println("Thrusday");
		break;
	}
	case 5:
	{
		System.out.println("Friday");
		break;
	}
	case 6:
	{
		System.out.println("Saturday");
		break;
	}
	case 7:
	{
		System.out.println("Sunday");
		break;
	}
//	case 8:	{  
//		
//         System.out.printf(" You chose: Exit");  
//         //exit(0);   
//         break;
//	}
	//default is not compulsory
	default :
		System.out.println("NODAY {press only from 1 to 7 }\n AND IT EXIT");
	
	}
	}while(n<8);
	}	
	
}
