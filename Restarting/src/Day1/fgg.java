/**
 * 
 */
package Day1;
import java.util.*;
public class fgg {

	public static void main(String[] args)
	{
		System.out.println("Enter month number 1 - 12 and for enter 13 ");
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
			
		switch(month){
		case 1: System.out.println(month+". Jan");
		break;
		case 2: System.out.println(month+". Feb");
		break;
		case 3: System.out.println(month+". March");
		break;
		case 4: System.out.println(month+". April");
		break;
		case 5: System.out.println(month+". May");
		break;
		case 6: System.out.println(month+". June");
		break;
		case 7: System.out.println(month+". July");
		break;
		case 8: System.out.println(month+". August");
		break;
		case 9: System.out.println(month+". September");
		break;
		case 10: System.out.println(month+". Octomber");
		break;
		case 11: System.out.println(month+". November");
		break;
		case 12: System.out.println(month+". December");
		break;
		
		
		
		
		default: 
			System.out.println("End program");
			System.exit(0);
			
			}
		}

		

		// TODO Auto-generated method stub

	}

}
