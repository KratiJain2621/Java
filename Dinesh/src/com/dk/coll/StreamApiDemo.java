package com.dk.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Test
{
	public boolean testObject(Object ob);
}

public class StreamApiDemo
{
	public static void main(String[] args)
	{
		Test test = (ob) -> ob.hashCode() %2 == 1;
		//Stream API : on demand data structure 
		//not a permanent DS like array, list, map, set
		//need it create it, after one operation it is not used again.
		List<String> list= new ArrayList<>();
		list.add("Ajay"); list.add("Sumit"); list.add("Rishi"); list.add("Rahul");
		list.add("Dev"); list.add("Ajay"); list.add("Rahul");
		for(int i = 0; i<list.size(); i++)
		{
			String el  = list.get(i); //fun call : new mem in STK clear mem after fn call
			System.out.println(el);
		}
		Stream<String> stream = list.stream();
		long count = stream.count();
		System.out.println("count=" + count);
		
		list.stream().count();
		Stream<String> distinct = list.stream().distinct();
		distinct.forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
		
		List<Integer> marks = new ArrayList<>();
		marks.add(23); marks.add(22); marks.add(22);  
		marks.add(36); marks.add(58); marks.add(55);  
		marks.add(84); marks.add(58); marks.add(89);  
		marks.add(88); marks.add(67); marks.add(47);  
		marks.add(38); marks.add(58); marks.add(12);  
		//Write a loop to check whether all students passed or not 
		boolean allMatch = marks.stream().allMatch( m -> m >= 40); //control 2 + L
		System.out.println("All passed = " + allMatch);
		//Write a loop to check any one got >= 90 or not ?
		
		boolean anyMatch = marks.stream().anyMatch(m -> m>=90);
		System.out.println("Above 90 =" + anyMatch);
		
		System.out.println();
		marks.stream().filter(m -> m>=60).forEach(System.out::println);
		//find count of those who failed <40 marks
		long failCount = marks.stream().filter(m -> m < 40).count();
		System.out.println("faile count = " + failCount);
		
		marks.stream().limit(5).forEach(System.out::println);
//		5 32 5 87 4 467 9 
//		32  5 87 4 467 9
//		32 87 4 467 9
//		87 4 467 9
//		87 467 9
//		467 9
//		467
		
		Optional<Integer> maxOpt = marks.stream().reduce(new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u)
			{
				return t > u ? t: u;
			} });
		Optional<Integer> reduce = marks.stream().reduce((t,u)-> t+u);
		System.out.println("sum=" + reduce);
		System.out.println("max = " + maxOpt.get());	
		
		Stream<Integer> filter = marks.stream().filter(m -> m >=40); //passed students
//		filter.max((i1, i2) -> i1 - i2);
		
		List<Integer> passedList= new ArrayList<>();
		for(int x : marks)
			if(x >= 40) 
				passedList.add(x);
		System.out.println(passedList);
		
		List<Integer> passList2 = marks.stream()
				.filter(m -> m>=40)
				.collect(Collectors.toList());
		System.out.println(passList2);
		//convert one type to another 
		List<Customer> customers  = new ArrayList<>();
		customers.add(new Customer(23,"Ajay", "Delhi"));
		customers.add(new Customer(24,"Akaash", "Delhi"));
		customers.add(new Customer(125,"Rahul", "Gurugram"));
		customers.add(new Customer(26,"Bipul", "Delhi"));
		customers.add(new Customer(27,"Sumit", "Chennai"));
		
		//1. get the list of names of customer and print it
		List<String> namesList = customers.stream()
				.map(cust -> cust.getName())
				.collect(Collectors.toList());
		System.out.println(namesList);
		
		
		//Terminal operations //final result
		//Intermediate operations : do not get final result, but get Stream
		//2. find the name of customer with max id
		Optional<Customer> optmaxid = customers.stream()
				.reduce((c1,c2)-> c1.getCustid() > c2.getCustid() ? c1:c2);
		String name = optmaxid.get().getName();
		System.out.println("name of max id = " + name);
		
		//3. get the list of customer residing in Delhi
		List<Customer> delhiList = customers.stream()
		.filter(cust -> cust.getAddress().contains("Delhi"))
		.collect(Collectors.toList());
		
		System.out.println(delhiList);
		
		Stream<Integer> lenStream = list.stream().map( t -> t.length());
		List<Integer> lenList = lenStream.collect(Collectors.toList());
		System.out.println(lenList);
		
		List<Integer> listInt = Arrays.asList(4,5,6,7);
		IntStream stream2 = Arrays.stream(new int[]{3,4,5,6,7});
//		stream2.max();
		IntSummaryStatistics summaryStatistics = stream2.summaryStatistics();
		System.out.println(summaryStatistics);
		System.out.println();
		int[] intAr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		
		IntStream stream3 = Arrays.stream(intAr);
		stream3.filter(el -> el%3==0).forEach(System.out::println);
		
		System.out.println();
		Arrays.stream(intAr).parallel().filter(el -> el%3 == 0).forEach(System.out::println);
		
		//multi threading : two things at same time : Save time
		Stream<Integer> idStream = customers.stream().map(cust -> cust.getCustid());
		IntStream intStream = customers.stream().mapToInt(cust -> cust.getCustid());
		intStream.average(); //5 stat oper : min, max, sum, average, count()
//		message : sendtime, acktime For sending 1 million messages what is average time taken
		
		
		
		
		
		
	}

}
