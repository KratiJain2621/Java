//		Example 1:
//
//			Input: nums = [10,9,2,5,3,7,101,18]
//			Output: 4
//			Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
		// TODO Auto-generated method stub
import java.util.Scanner;
public class longestIncreasingSequence {

	public static void main(String[] args) 
	{
		int sum = 1;
        int total = 13;
        Scanner sc = new Scanner(System.in);

        // User se array length ke liye input
      //  System.out.print("Enter the size of the array: ");
        int n = 10000;
        		//sc.nextInt();
        
        // Array declaration
        int[] count = new int[n];
        
        // User se array elements ke liye input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            count[i] = sc.nextInt();
        }

        for(int i = 0;i<count.length - 1;i++)
        {
        		if(count[i]<count[i+1])
        		{
        		      System.out.print(count[i]+" , ");
        			sum = sum+1;
        		}
        		else
        			sum = 1;
         }
        System.out.println("\n sum "+sum);
        
	}

}
