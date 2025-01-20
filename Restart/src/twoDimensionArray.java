
public class twoDimensionArray {

	public static void main(String[] args) 
	{
		int marks[][] = new int[4][3];
		marks[0][0] = 40;
		marks[0][1] = 45;
		marks[0][2] = 43;
		marks[1][0] = 66;
		marks[1][1] = 77;
		marks[1][2] = 50;
		
		System.out.print(marks[0][0]+" ");
		System.out.print(marks[1][1]+" ");
		System.out.println(marks[0][2]);
		// TODO Auto-generated method stub
		
		int marksFinal[][] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		  for(int i = 0 ; i<marksFinal.length;i++)
	      {
			  for(int j = 0 ; j<i;j++)
		      {
				  //if(i == j)
				  System.out.print(" "+marksFinal[i][j]);
		      }
	      }

	}

}
