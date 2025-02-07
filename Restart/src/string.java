import java.util.*;
public class string 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//String literal
		String s = "ghf";
		String sa = "Ghf";
		String ss = "ghf";

		//Using new keyword
		  String str1 = new String("ghf");
		String str = new String("GeeksforGeeks");
		Scanner sc = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter name: ");
       String FirstName = sc.nextLine();
       String LastName = sc.next(); // next se y ek hi word lega
		  System.out.println(FirstName);
		  System.out.println(LastName);
			  
//          for(int i = 0;i<11;i++)
//          {
//        	  String studentList = sc.nextLine();	  
//          }

		  System.out.println(s);
          System.out.println(str);
          

        //primitive data type m value ko dekha jata hai non primitive m reference ko
		 if(s == ss)
		 {
			 System.out.println("s and ss refrence at same point Equal");  	 
		 }
		 if(s == str1){
			 System.out.println("s and str1 are refrence at same point  Equal");  	 
		 }
		 else 
		 {
			 System.out.println("s and str1 are not refrence at same point Not Equal");  	 
		 }
		 if(s.equals(str1))
		 {
			 System.out.println("both have same value");
			 
		 }
		 if(s.equalsIgnoreCase(sa))
		 {
			 System.out.println("Both have same value but dfr case");
			 
		 }
		 System.out.println("Concatination of string -->"+s+sa+ss);
		 System.out.print("Enter 2 numbers");
		 
		int ab = sc.nextInt();
		 int ac = sc.nextInt();
		 System.out.println(ab);
		 System.out.println(ac);
		 if(ab == ac)
			 System.out.print("true");
		 else
			 System.out.print("false");
		 
		 
		 
	}

}
