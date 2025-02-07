//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class isPalindrome {

    
// } Driver Code Ends
// User function Template for Java

// function to check if s is palindrome
// It should return true is the given
// string is palindrome otherwise false
public static boolean isPalindrome(String s) 
{
    s= s.toLowerCase();
    
    int left = 0;
    int right = s.length()-1;
    while(left<right)
    {
       if(s.charAt(left) != s.charAt(right))
           return false;
        left++;
        right--;
    }
    return true;

    // code here
    
    
}


//{ Driver Code Starts.

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String s = read.readLine().trim();

            boolean palindrome = isPalindrome(s);
            if (palindrome)
                System.out.println("True");
            else
                System.out.println("False");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends