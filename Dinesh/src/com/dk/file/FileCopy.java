package com.dk.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy
{
	public static void main(String[] args)
	{
		// binary file    text files
		//jpg, avi, mp3, exe class jar  doc pdf xls   Binary
		//TEXT : .txt, c, cpp java , html , xml Text file
		/*Streams
		 * ByteStream						Character STream
		 * InputStream OutputStream		  	Reader  Writer
		 * FileInputStream 						FileReader
		 */
		FileReader fr = null;
		FileWriter fw = null;
		try
		{
//			fr = new FileReader("d:/dbcmds/selectbook.sql");
			fr = new FileReader("names.txt");
//			fw = new FileWriter("mycopy.sql");
			fw = new FileWriter("namescopy.txt");
			int ch = 0;
			while(ch != -1)
			{
				ch = fr.read();
				if(ch != -1) 
					fw.write(ch);
			}
			
		} catch (FileNotFoundException e) //checked exception
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				fw.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println("file copy created");
		
		
	}

}
