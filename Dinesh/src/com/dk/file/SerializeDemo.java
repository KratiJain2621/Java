package com.dk.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Marker interface wihtout any methods

class  Emp implements Serializable //i want o convert object to bytes 
{
	int empid;
	String name;
	public Emp(int empid, String name)
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Emp [empid=" + empid + ", name=" + name + "]";
	}
	
}
public class SerializeDemo
{
	
	/*
	 * binary file   text file
	 * 	Frame Data packet   8 bytes hw/address 3 bits 4 bist 1 bit 2 CRC
	 * binary format Ascii vlaues XXX
	 * jpg mp3 mp4 abcd notes, colors, animation 
	 *  
	 * 					234 12
	 * 					1023  100
	 * 					129 78
	 * 					scanf("%d", &x)	 scanner.nextIn() slow  2 3 4 =234
	 * int 4 byte int
	 * int x = 20; 
	 */
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileOutputStream fos = new FileOutputStream("bindata.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		int x = 234;
		int y = 98;
		oos.writeInt(x);
		oos.writeInt(y);
		Emp e = new Emp(900, "Amit");
		oos.writeObject(e);
		oos.close();
		fos.close();
		
		FileInputStream fin = new FileInputStream("bindata.bin");
		ObjectInputStream ois = new ObjectInputStream(fin);
		int a = ois.readInt();
		int b = ois.readInt();
		System.out.println("values =  " + a + "," + b);
		Object objFromFile = ois.readObject();
		System.out.println("object = " + objFromFile);
		ois.close();
		fin.close();
	}

}
/*
 * 1 city map
 * 2. count of a word in a file
 * 
 */


