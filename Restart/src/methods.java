
public class methods {

	public static void main(String[] args) //calling method
	{
		//class ka obj bnana bhi fun run kr pao isliye static bnate hai
		// void k sath return a type kuch bhi nhi likh sakte
		
		System.out.println(args[0]); 
		// iska o/p ayega jb aap argument pass kroge using run configuration
 		
		for(String arg : args)
 		{
 			System.out.print(arg+" ");
 		}
		
		greet();//method call
 		int result = sum(0);
		System.out.print(result);
 		 avg(4, 14, false);
		// TODO Auto-generated method stub

	}
	
	static void greet() //called method
	{
		System.out.println("Hello");
		
	}
	static int sum(int a) {
		int b = 5;
		int c= 10;
		a = a+b+c+8;
		System.out.print("Sum -->");
        return a;	
	}

	public static void avg(int a, int b, boolean shouldAvg) 
	{
		int avg = (a+b)/2;
		System.out.print("\nAverage-->"+avg);    
	}
	

}
