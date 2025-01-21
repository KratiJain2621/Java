package com.dk.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileInfo
{
	public static void main(String[] args) throws IOException
	{
		
//		Enter the path of dir : D:/dbcmds
//		scan this
//		create list of files file.list() file.listFiles()
//		for item in the list display 
//		name		Size		File/Dir
//		abc.txt		109			File
//		java		0			Dir
//		pics		0			Dir
//		india.jpg	45620		File
		
		File dr = new File("D:/dbcmds");
		if(!dr.exists())
		{
			System.out.println("Dir does not exist . Bye");
			return;
		}
		File[] files = dr.listFiles();	
		for(File file : files)
		{
			System.out.print(file.getName() + "\t\t");
			System.out.print(file.length() + "\t\t");
			System.out.println(file.isFile() ? "File" : "Dir");
		}
		
//		File with max size  Print the details of file with max size
			
		
		
		File dir = new File("d:/somedir");
		System.out.println(dir.exists());
		dir.mkdir();
		
		File fileDir = new File("D:/dbcmds");
		System.out.println(fileDir.exists());
		System.out.println(fileDir.getName());
		System.out.println(fileDir.getFreeSpace());
		System.out.println(fileDir.getAbsolutePath());
		System.out.println(fileDir.isDirectory());
		String[] list = fileDir.list();
		System.out.println(Arrays.toString(list));

		
		System.out.println();
		fileDir = new File("d:/dbcmds/selectbook.sql");
		System.out.println(fileDir.isFile());
		System.out.println(fileDir.length());
		System.out.println(fileDir.canWrite());
		System.out.println(fileDir.getParentFile());
		
	}

}
