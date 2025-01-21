package learning;
import java.util.Scanner;
public class While3 {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int i;
		System.out.println("Enter 0 to exit");
		while(true)
		{
			System.out.println("enter any integer value");
			i = obj.nextInt();
			if(i==0)
				 break;
			System.out.println(i);
			i++;
		}
		System.out.println("End Program");
		// TODO Auto-generated method stub

	}

}
