
public class arraysExample 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = {1,24,3,3,4,12};
        int total = 0 ;
        int max = count[0];

	      System.out.println("At first index "+count[1]);
	      System.out.println("\nLength of array is "+count.length);

	      for(int i = 0 ; i< count.length; i++)
	      {
	    	  System.out.print(count[i]);
	    	  if(i<count.length - 1)
	    		  System.out.print(", ");
	    	  // total of all the elements
	    	  total= total+ count[i];
	    	  
	    	  //finding the largest elements
	    	  if(count[i]>max)
	    		  max = count[i];
	      }
	      System.out.println("\n\nTotal is "+total);
	      System.out.println("Max is "+max+"\n");
	      
	      
	      //string in array
	      String names[] = {"hechj", "hc3","aas","rudt"};
    	  System.out.print("Names are --> ");
	      for(int i = 0 ; i< names.length; i++)
	      {
	    	  System.out.print(names[i]);
	    	  if(i<names.length - 1)
	    		  System.out.print(", ");
	    	  
	      }
	      
	    	
	      
	      

	}
}
