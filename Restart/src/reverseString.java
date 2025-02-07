import java.util.Scanner;
public class reverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        
        System.out.println("Reversed String "+reversed);
        sc.close();
	}
	public static String reverseString(String str)
	{
		return new StringBuilder(str).reverse().toString();
		
	}

}
