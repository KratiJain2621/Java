package com.dk;

import com.dk.model.Customer;

public class CustomerStaticDemo {
	
	public static void main(String[] args) {
		System.out.println("init count " + Customer.getCount());
		
		Customer c1 =new Customer("Jagdeesh");
		Customer c2 =new Customer("Jagdeesh");
		System.out.println("Now count " + Customer.getCount());

		Customer c3 =new Customer("Jagdeesh");
		System.out.println("Now count " + Customer.getCount());
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		Customer c = new Customer("Rahul");
		c = new Customer("Rishi1");
		c = new Customer("Rishi2");
		c = new Customer("Rishi3");
		c = new Customer("Rishi4");
		c = new Customer("Rishi5");
		c = new Customer("Rishi6");
		c = new Customer("Rishi7");
		
		//when system is low in memory
		//garbage collection will happen
		System.gc(); //call garbage collector
		//GC will call a method finalize() for each
		//object that it reclaims 
		
		System.out.println("Main ends here");
		
		
	}

}
