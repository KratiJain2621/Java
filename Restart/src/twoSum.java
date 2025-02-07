
public class twoSum {

	public static void main(String[] args) 
	{
		int count[] = {1,24,3,3,4,12};
        int total = 13;
        for(int i = 0;i<count.length;i++)
        {
        	for(int j = 1; j<count.length;j++)
        	{
        		int sum = count[i]+count[j];
        		if(total == sum)
        		{
        			System.out.println(count[i]+" , "+count[j]);
        			break;
        		}
        	}
        }
        
		// TODO Auto-generated method stub

	}

}
