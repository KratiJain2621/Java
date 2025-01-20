
public class forEachLoop {

	public static void main(String[] args) 
	{
		int counting[] = {11,2,3,3,4,12};
        int sum = 0;
        //int min = Integer.MAX_VALUE ;
        int min = counting[0];
        int max = Integer.MIN_VALUE;
	      for(int count: counting)
	      {
	    	  System.out.print(count+", ");
	    	  sum = sum+count;
	    	  
	    	  if(count<min)
	    		  min = count;
	    	  if(count>max)
	    		  max = count;
	    	 
	      }
    	  System.out.println("\n\nSum of array is "+sum);

    	  System.out.println("Minimum of array is "+min);
    	  System.out.println
    	  ("Maximun of array is "+max);

		// TODO Auto-generated method stub
     
	}

}
