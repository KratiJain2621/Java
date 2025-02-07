
public class stringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, world!";
		int b = str.length();
		System.out.println("Length "+b);
		String sliced = str.substring(1,b-1);
	//	System.out.println(str.capitalize());
		 String cap = str.substring(0,1).toUpperCase()+str.substring(1); 
		    System.out.println(cap); 
		System.out.println(str.toUpperCase());
		 if(str.length()<=1||str == null)
			 System.out.println("");  
		 else 
		System.out.println(sliced);  
		// Output: "world!"
		 
		 String words[] = str.split(" ");
	      int length = words.length;
			System.out.println(length);
			
	}

}
