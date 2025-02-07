import java.util.Scanner;

public class panagramString {

    // Function to check if the string is a pangram
    public static boolean isPangram(String str) {
        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();
        
        // Create a boolean array to keep track of the 26 letters of the alphabet
        boolean[] alphabet = new boolean[26];
        
        // Traverse through the string and mark the letters that appear
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }
        
        // Check if all 26 letters are marked as true
        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is missing, return false
            }
        }
        
        return true; // All letters are present, so it's a pangram
    }

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
