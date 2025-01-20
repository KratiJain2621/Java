import java.util.*;
public class sorting2DArray 
{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int mat[][] = { 
					{12, 1, 14, 3, 16},
					{14, 2, 1, 3, 35},
					{14, 1, 14, 3, 11},
					{14, 25, 3, 2, 1},
					{1, 18, 3, 21, 14}
										};

		int n = 5;
		int curr_index[] = new int[n];
		int f = 0;
		for (int i=0; i<n; i++) 
			Arrays.sort(mat[i]);


		for (int i=0; i<n; i++) 
		{
			for (int j=0; j<n; j++) 
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
		}


