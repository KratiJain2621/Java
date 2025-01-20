
public class DataTypeConversion 
{
	public static void main(String[] args)
	{

		System.out.println("Hello, Let's start learning Data Types Conversion \n\n 1) Implicit Data Types Conversion\n");
	  int count = 12;
	  long countLong = count;
	  System.out.println("Here the data type of value is int " +count);
	  System.out.println("Here the data type of value is long " +countLong);
	  System.out.println("\n2) Explicit Type Conversion ");
	  
	  long one = 987654321l;
	 int oneLong = (int)one;

	  System.out.println("Here the data type of value is long " +one);
	  System.out.println("Here the data type of value is int " +oneLong+"\n");

	  long two = 9876543210000l;
	  int twoLong = (int)one;

	  System.out.println("# Here we are  taking a value in long which was greater than the range of int let's see what happen\n");
		  System.out.println("Here the data type of value is long " +two);
		  System.out.println("Here the data type of value is int " +twoLong);

		  int three = 1270;
		  byte threebyte = (byte)three;

		  System.out.println("\n# Here we are  taking a value in int which was greater than the range of byte let's see what happen\n");
			  System.out.println("Here the data type of value is int " +three);
			  System.out.println("Here the data type of value is byte " +threebyte+"\n");
			  
			 float a = 9.99f;
			 System.out.println(a);
			 int b = (int)a;
			 System.out.println(b);
			 

	}
} 
