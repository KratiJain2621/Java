package com.dk.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			Properties props = new Properties();
			
			props.load(new FileInputStream("myprops.txt"));
			String user = props.getProperty("dbuser");
			
			Set<Object> keySet = props.keySet();
			for(Object key: keySet)
			{
				Object value = props.get(key);
				System.out.println(key + ":" + value);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
