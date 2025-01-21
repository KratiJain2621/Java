package com.gl.proj.algo;
import java.util.*;
public class KratiNameSplitter 
{
		
		public static void main(String[] args) 
		{
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Enter names");
			//String str = sc.nextLine();
			String str = "If, you don't like something, change.it.";   
			String[]  stringarray = str.split("[, ;]+");
		   
		    
		    for(int i=0; i<stringarray.length; i++)  
		    {  
		    //prints the tokens  
		    System.out.println(stringarray[i]);  
		    }  
		}

	
}

  
