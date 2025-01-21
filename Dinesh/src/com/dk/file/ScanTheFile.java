package com.dk.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScanTheFile
{
	public static void main(String[] args)
	{
		FileReader fr = null;
		try
		{
			fr = new FileReader("numbers.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			while(line !=null)
			{
				System.out.println("line = " + line);
				
				if(line == null) break;
				String[] numsStr = line.split("\\s+");
				int sum = 0;
				for(String numS : numsStr)
				{
					int x = Integer.parseInt(numS);
					sum = sum + x;
				}
				System.out.println("sum of line = "+sum);
				line = br.readLine();
			}
			
//			sum of line  = 9
//			sum of line = 12
//			sum of line = 13
//			sum of line = 6
		}
		catch (FileNotFoundException e)
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
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}
}
