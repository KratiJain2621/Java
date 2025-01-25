
public class mathClassMethod {

	public static void main(String[] args) 
	{
		int x = 2;
		int xx = 400;
		int y = 4;
		int z = 11;
		int a = Math.min(x, y);
		int b = Math.max(x, y);
		double c = Math.sqrt(xx);
		int d = Math.abs(x);
		double e = Math.random();
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(Math.pow(3, 4));
		System.out.println("Minimum "+a+", Maximum "+b+ ", Square Root "+c+", abs "+d+", Random Number "+e+", Random Int Number "+randomNum);
    	
    //	System.out.println("Minimum "+Math.min(x, y,z));
    	System.out.println("Minimum "+Math.min(Math.min(x, y), Math.min(z, xx)));
    	System.out.println(Math.max(x, y));
    	
    	System.out.println(Math.sqrt(y));
		
// TODO Auto-generated method stub

	}

}
