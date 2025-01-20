
public class labeledContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Labeled Continue");
			outer_loop:
			for(int i = 1 ; i<=10;i++)
		      {
				 for(int j = 1 ; j<=i;j++)
			      {
					 if(j == 3) continue outer_loop;
			         System.out.print(i+""+j+" ");
			      }
				 System.out.println();
		      }
			 System.out.println("\n\nNormal Continue");
			 for(int i = 1 ; i<=10;i++)
		      {
				 for(int j = 1 ; j<=i;j++)
			      {
					 if(j == 3) continue;
			         System.out.print(i+""+j+" ");
			      }
				 System.out.println();
		      }
		
	}

}
