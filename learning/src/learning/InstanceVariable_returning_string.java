package learning;
import java.util.Scanner;
public class InstanceVariable_returning_string 
{
	public static void main(String[] args)
	{
	Test1 obj = new Test1();
	
	System.out.println("First name: "+obj.fname());
	String lastname = obj.lname("Shows");
	System.out.println("Last name: "+lastname);
	}
}
class Test1
{
	String fname()//Instance method
	{
	   String s = "Geeky";//local variable
	   return s;
	}
	String lname(String st)//Instance method
	{
		String str = st;//local variable
		return str;
	}
	
}