import java.util.Scanner;

public class printAlphabets {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the starting character (c1)
        System.out.print("Enter the starting character (c1): ");
        char c1 = scanner.next().charAt(0);
        
        // Ask the user to enter the ending character (c2)
        System.out.print("Enter the ending character (c2): ");
        char c2 = scanner.next().charAt(0);
        
        // Get the result as a string and print it
        String result = getAlphabets(c1, c2);
        System.out.print(result);
        System.out.println("\n\nPrinting via function");
        alphabets(c1, c2);  // Call function to print alphabets
        System.out.println();  // Print a new line after each test case
    
        // Close the scanner to avoid resource leak
        scanner.close();
    }
    
    public static String getAlphabets(char c1, char c2) {
        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Loop through characters from c1 to c2
        for (char c = c1; c <= c2; c++) {
            result.append(c).append(" ");
        }
        
        // Return the final string
        return result.toString();
    }

public static void alphabets(char c1, char c2){
    StringBuilder result = new StringBuilder();
    for (char c = c1; c<=c2;c++)
    {
   //  result.append(c).append(" ");
    System.out.print(c+" ");
        
    }
    //return result.toString();
}

}
