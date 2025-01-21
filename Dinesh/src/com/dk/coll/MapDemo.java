package com.dk.coll;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class WordSearcher
{
	public static int getCountOfWord(String filename, String word)
	{
		return 0;
	}
}
public class MapDemo
{
	public static void main(String[] args)
	{
//		List ordred collection
//		Set  unordered collection of unique elements
//		Map key : value search , delete , insert , order by Key value
		//key value pair
		/*
		 * Key		value
		 * rollno	marks
		 * 120		23
		 * 121		88
		 * 122		67
		 * 
		 * 
		 * Form 
		 * key		value
		 * name		dinesh
		 * password passcode
		 * age		35
		 * email	dksw@gmail.com
		 * address	delhi
		 * 
		 * <img
		 * src	/pics/india/map34.jpg
		 * width	
		 * height	
		 * 
		 * CSS
		 * display	none block inline
		 * color	red
		 * background-color	green
		 * marginx	23
		 * marginy  23
		 * 
		 * 
		 */
		
		Map<String, Integer> map = new HashMap<>();
		Integer prev = map.put("Ajay" , 44); System.out.println(prev);
		map.put("Arnav", 59);
		map.put("Aman", 54);
		map.put("Sumit", 59);
		map.put("Jagdeesh", 20);
		map.put("Rahul", 25);
		
		System.out.println(map);
		Integer prevaj = map.put("Ajay",87); System.out.println("prev= "+prevaj);
		
		System.out.println(map);
		Integer marks = map.get("Aman");
		System.out.println("marks of aman = " + marks);
		
		int[] ar = { 343,55,73,85,337,555,66,34,18,897,66,12,84,507,80,8,71,540,3};
		Map<Integer, Integer> fmap = new HashMap<>();
		for(int x : ar)
		{
			if(fmap.containsKey(x))
			{
				int freq = fmap.get(x);
				fmap.put(x, freq + 1);
			}
			else
				fmap.put(x,  1);
		}
		System.out.println(fmap);
		
//		Map<Integer, List<Integer>> remMap = getRemainderMap(ar, 10);
//		0 80, 540
//		3 343 73 
//		5 55 85
//		6 86
//		7 337
//		8 78
//		Enter your name
//		Enter city live in
//		Diensh Kumar
//		Ambala City
//		Arvan Shaaya
//		Delhi
//		Amaan Ag
//		Chennai
//		Rahul Batra
//		Kanpur
//		
//		
//		blank line means end of input
//		map<string, list<string>> delhi : Arnav saahay , Rahul Batra
//									Kanpur : 
//								Chennai : 			
//		for(List<Integer> list : lisoflist)
//		{
//			for(int x : list)
//			{
//				System.out.println(x);
//			}
//			System.out.println();
//		}
		
									
		File dir =new File("d:/dbcmds");
		File[] filesAndFolders = dir.listFiles();
		for(File f : filesAndFolders)
		{
			if(f.isFile())
			{
				
			}
		}
		
		
	}

}
