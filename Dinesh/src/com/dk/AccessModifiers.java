package com.dk;

import com.dk.model.Customer;

class Values
{
	private final String db;
	final String user;
	public Values(String db, String user) {
		super();
		this.db = db;
		this.user = user;
	}
}

public class AccessModifiers {
	/*
	 * Model classes Banking : Account Customer, Transaction, FixedDeposit, Loan
	 * 
	 * Ecommerce : Customer, Product, Category, Refund, Payment, Replacement, Data :
	 * in model classes Order , Coupon
	 * 
	 * Model classes Library : Book, Student, Faculty, IssueRecord
	 * 
	 * com.gl.ins.model Account Customer, Transaction, FixedDeposit, Loan
	 * com.gl.ins.dao AccountDao : will get Account info from db CustomerDao : will
	 * get Customer infor from db com.gl.ins.service Algorithms to operate on the
	 * data FixedDepositService LoanService AccountService
	 * 
	 * 
	 * 
	 */
	/*
	 * private : only in class
	 * public : accesible by all
	 * default : (don't write anything) : only in same package
	 * protected data : same package + sub class (derived class) in any package
	 * 
	 * 
	 */
	public static void main(String[] args) {
		final int color = 1;
		Customer c= new Customer("jagdeesh", "Chennai");
		c.setName("Jagdeesh Kumar");
		
		Values v= new Values("Oracle", "admin");
//		v.db  = "Mysql";
//		System.out.println("db = " + v.db);
		
		
		
	}

}
