//package com.dk.interf;
//
////only behaviour interfaces
//// interface is a contract : in the form of methods 
////these methods must be in the class   
///*	CAN NOT CREATE OBJECT OF ABSTRACT CLASS			CAN NOT OBJEC OF INTERFACE
// * abstract class									interfaces
// * actual class some portion incomplete				Contract
// * data, abstract behaviour 						abstracct behaviour
// * Accont (acno, ) 									only methods (no data)
// * extend only one class					can implement multiple interfaces
// */
///*
// * Data , I am concerned for Behaviour not the data
// * Login in to the system : userid, password  , token (Goolge)
// * Go to db and check login 
// * 
// * class DBAccess
// * {
// * 	checkLogin(user, password)
// * }
// * class FingerPrintChecker
// * {
// * checkLogin(user, password fingerprint ) { ???????????? } 
// * }
// * class LoginWithGoogle
// * {
// * checkLogin(user, password (token) )
// * }
// * 
// * Stack : static stack, dynamic stack push pop 
// * 		array + top			Linked List
// * 
// */
//interface Transport
//{
//	public int humanCapacity();
//}
//
//interface GoodsTransport extends Transport
//{
//	public int weightCapacity();
//}
//
//interface Flier
//{
//	public void fly();
//}
//
//class Truck implements GoodsTransport
//{
//
//	@Override
//	public int humanCapacity()
//	{
//		return 0;
//	}
//
//	@Override
//	public int weightCapacity()
//	{
//		return 0;
//	}
//	
//}
//class Bird implements Flier
//{
//	public void fly() 
//	{ 
//		System.out.println("bird is flying");
//	}
//}
//class Aeroplane implements Flier, Transport
//{
//	public void fly() 
//	{ 
//		System.out.println("aeroplane is flying");
//	}
//	public int humanCapacity()
//	{
//		return 150;
//	}
//}
//interface Calc
//{
//	int gettSum(int a, int b);
//	int getProduct(int a, int b);
//}
//public class InterfaceDemo
//{
//	public static void main(String[] args)
//	{
//		Flier obj ;
////		obj = new Flier(); //error
//		obj = new Bird();
//		obj.fly();
//		
//		obj  = new Aeroplane();
//		obj.fly();
//		//why is error , correct it
////		System.out.println("capacity of plane = " + obj.humanCapacity());
//		//java will create a class with some name 
//		//and create an object of it
//		Flier flobj = new Flier() {
//			public void fly()
//			{
//				System.out.println("anonymous class object flying");
//			}
//		};
//		
//		flobj.fly();
//		
//		Calc cal = new Calc();
//	}
//	
//}
