package com.dk.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo
{
	public static void main(String[] args)
	{
		// {1,2,3 } = { 2,3,1} order does not matter
		// {1,2,2} : NO REPEATED ELEMENTS
		// FAST 
		// LIst list= new ArrayList using Array : search element scans the whole array
		// 6 -> 98 -> 109 -> 300 -> 390 -> null
		
		//List<Integer> list = new LinkedList<>();
		
		// 234 56 2 5667 223 587 587 22 74 9087 1 million elements 
		// binary search tree, BTree, B+ Tree, Red Black TRee, AVL Tree
//		Hashing, Tree
//		Set<Integer> set = new HashSet<>();
		Set<Integer> set = new TreeSet<>();
		boolean added = set.add(34); System.out.println(added);
		added = set.add(34); System.out.println(added);
		added = set.add(23); System.out.println(added);
		added = set.add(3); System.out.println(added);
		added = set.add(324); System.out.println(added);
		added = set.add(34); System.out.println(added);
		added = set.add(323); System.out.println(added);
		added = set.add(734); System.out.println(added);
		
		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<>();
		added = set2.add(34); System.out.println(added);
		added = set2.add(304); System.out.println(added);
		added = set2.add(231); System.out.println(added);
		added = set2.add(30); System.out.println(added);
		added = set2.add(324); System.out.println(added);
		added = set2.add(384); System.out.println(added);
		System.out.println(set2);
		set.addAll(set2);
		System.out.println(set);
		set.removeAll(set2);
		System.out.println(set);
		for(int x : set)
			System.out.println("in set = " + x);
		set.remove(3);
		System.out.println(set);
		List<Integer> list = new LinkedList<>();
		for(int i = 101; i<=130; i+=4) list.add(i);
		for(int i = 101; i<=130; i+=4) list.add(i);
		list.add(754);
		list.add(345);
		list.add(890);
		list.add(392);
		
		List<List<Integer>> listOfRemList = getRemainderList(list);
		
		/*
		 * number % 10 : 
		 * 0 : list
		 * 1 : list
		 * 2 : list
		 * 3 : list
		 * 6 : list (empty)
		 * 7 : list
		 * 
		 * 
		 * 8 : Empty list
		 * 9 : list
		 * 
		 * List<List<Integer>> list 
		 */
		
		System.out.println(list);
		set.addAll(list);
		System.out.println(set);
		
		printDuplicates(list); //do it with 2 sets
		String str= "this is java stirng for use";
		List<List<Character>> listOfList = getRepeatedAndNonRepeatedChars(str);
		int x = 620302;
//		What are the digits used to create this integer;   
		int[] digits = getUniqueDigits(x); //6,2,0,3 do it with the help of set theory
		
		
		
	}
	
	

	private static List<List<Integer>> getRemainderList(List<Integer> list)
	{
		 List<List<Integer>> listoflist= new ArrayList<>();
		 for(int i = 0; i<10; i++)
		 {
			 listoflist.add(new ArrayList<>());
		 }
		 for(int x : list)
		 {
			 int rem = x % 10;
			 listoflist.get(rem).add(x);
		 }
		 return listoflist;
	}



	private static List<List<Character>> getRepeatedAndNonRepeatedChars(String str)
	{
		Set<Character> allSet = new HashSet<>();
		Set<Character> dupliSet = new HashSet<>();
		
		for(char ch : str.toCharArray())
		{
			if(allSet.add(ch) == false) //repeated
			{
				dupliSet.add(ch);
			}
		}
		//5 6
		//1 2 3 4
		allSet.removeAll(dupliSet);
		
		List<List<Character>> listOflist = new ArrayList<>();
		List<Character> replist = new ArrayList<>(dupliSet);
		List<Character> nonreplist = new ArrayList<>(allSet);
		listOflist.add(replist);
		listOflist.add(nonreplist);
		return listOflist;
		
	}
/*
 * 334592 % 10  2   n / 10  3459
 * 33459 % 10  9    n / 10 	345
 * 3345 % 10   5
 */
	private static int[] getUniqueDigits(int x)
	{
		Set<Integer> set = new HashSet<>();
		while(x != 0)
		{
			int rem = x % 10;
			set.add(rem);
			x = x / 10;			
		}
		int[] ar = new int[set.size()];
		int i = 0;
		for(int el : set)
			ar[i++] = el;
		return ar;
		
	}

	private static void printDuplicates(List<Integer> list)
	{
		Set<Integer> allSet = new TreeSet<>();
		Set<Integer> dupliSet = new HashSet<>();
		for(int x : list)
		{
			boolean put = allSet.add(x);
			//if true , first time came so put in the set
			if(put == false)// already there in the set
			{
				dupliSet.add(x);
			}
		}
		dupliSet.forEach(System.out::println);
	}
}
