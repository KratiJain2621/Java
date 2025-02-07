import java.util.Scanner;

public class panagramStringUsingFunction {

	public static void main()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int n = str.length();
        for (int i = n-1;i>=0;i--)
        {
        	System.out.print("bda");
        	//System.out.append(str, i, n);
        }
		// TODO Auto-generated method stub

	}
//	public static boolean isPanagram(String str)
//	{
//		System.out.print(false);
//	}

}
