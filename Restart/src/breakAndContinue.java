
public class breakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	      for(int i = 1 ; i<=10;i++)
	      {
	    	  if(i == 4)
	    	  {
	    	  System.out.println(i+" --> "+(i+7));
	    	  break;
	    	  }

	    	  System.out.println(i+" --> ");
	      }
	    	  
	      for(int i = 10 ; i<=15;i++)
	      {
	    	  if(i == 12)
	    	  {
	    		  continue;
	    	  }
	    	  System.out.println(i+" --> ");
	      }	      
	}

}








