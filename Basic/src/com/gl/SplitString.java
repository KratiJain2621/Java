package com.gl;
import java.util.*;

public class SplitString  
{   
public static void main(String args[])   
{   
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter names");
	String s = sc.nextLine();
  
//split string by multiple delimiters   
String[] stringarray = s.split("[,;]+");   
//iterate over string array  
for(int i=0; i< stringarray.length; i++)  
{  
//prints the tokens  
System.out.println(stringarray[i]);  
}  
}   
}  