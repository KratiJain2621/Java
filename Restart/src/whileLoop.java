/**
 * 
 */

/**
 * @author Krati
 *
 */
import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
       while(i<=10)
       {
    	   System.out.print(i+" ");
    	   i++;// yha aap update nhi kroge to y infinite loop m chala jayega
    	   
       }
       Scanner sc = new Scanner(System.in);
    	   boolean hasLearnt = false;
    	  while(!hasLearnt)
    	  {
    		   System.out.print("\nContinue Learning\n Have you Learnt?");
    		  hasLearnt = sc.nextBoolean();// input m true or false hi dena hoga
    	  }
    	  System.out.print("Great, Move Ahead!!");      }
	}


