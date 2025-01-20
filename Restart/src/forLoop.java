import java.util.Scanner;
public class forLoop 
{
	public static void main(String[] args)
	{
      for(int i = 1 ; i<=10;i++)
      {
    	  System.out.println(i+" --> "+(i+7));
      }
      
      Scanner sc = new Scanner(System.in);
	  System.out.println("\nFor sum of multiple numbers enter number ");
	  int n = sc.nextInt();
	  int sum = 0;
	  int count = 0;
	  for(int i = 1 ; i<=n;i++)
      {
		  sum = sum + i;
		 // System.out.print(i+" > "+sum+" | ");
		  count = count + 1;
      }
	System.out.println("\nSum of "+n+" numbers is "+sum);	
	 System.out.println("\nFor sum of "+n+" even numbers ");

      int avg = (int)sum/count;
  	System.out.println("avg");  
	 int sumE = 0;
	  for(int i = 1 ; i<=n;i++)
      {
		  if(i%2 == 0)
		  {
		  sumE = sumE + i;
		  System.out.print(i+" > "+sumE+" | ");
		  }	
      }
		System.out.println("\nSum of "+n+" even numbers is "+sumE);

	}

	 
}
