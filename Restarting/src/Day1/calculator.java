/*
 CALCULATOR
*/
package Day1;

import java.util.*;
public class calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Press 1 for Addition\nPress 2 for Subtraction\nPress 3 for Multiplication");
		System.out.println("Press 4 for Divison\nPress 5 for Remainder");
		System.out.println("Enter 2 number and also select 1 to 5 for operator");
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int operator = sc.nextInt();
		switch(operator){
		case 1: 
			System.out.println("Addition of two number");
			System.out.println(a+b);
		break;
		case 2: 
			System.out.println("Subtraction of two number");
			System.out.println(a-b);
			break;
		case 3:
			System.out.println("Multiplication of two number");
			System.out.println(a*b);
		break;
		case 4: 
			System.out.println("Divison of two number");
			System.out.println(a/b);
		break;
		case 5: 
			System.out.println("Remainder of two number");
			System.out.println(a%b);
		break;
		default: 
			System.out.println("Invalid operator");
			System.exit(0);
			
			}
		}


	}

}
