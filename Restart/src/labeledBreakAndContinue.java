
public class labeledBreakAndContinue 
{

	public static void main(String[] args) 
	{
		 System.out.println("Labeled Break");
		outer_loop:
		for(int i = 1 ; i<=10;i++)
	      {
			 for(int j = 1 ; j<=i;j++)
		      {
				 if(j == 3) break outer_loop;
		         System.out.print(i+""+j+" ");
		      }
			 System.out.println();
	      }
		 System.out.println("\n\nNormal Break");
		 for(int i = 1 ; i<=10;i++)
	      {
			 for(int j = 1 ; j<=i;j++)
		      {
				 if(j == 3) break;
		         System.out.print(i+""+j+" ");
		      }
			 System.out.println();
	      }
	}

}
