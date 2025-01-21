package com.dk.jdbc;

import java.util.Scanner;

import com.dk.service.LibraryServiceImpl;

public class LibMainAction
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		LibraryServiceImpl service  = new LibraryServiceImpl();
		while(true)
		{
			System.out.println("1. To show all books");
			System.out.println("2. To show all students");
			System.out.println("3. To issue a book");
			System.out.println("4. To return a book");
			System.out.println("5. Exit");
			System.out.println("6. View issued Books list");
			System.out.println("7. To add new Book");
			System.out.println("8. To add new Student");
			int bid = 11;
			int sid = 15;
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				//code 
//				service.getAllBooks();
				//print all books
				break;
			case 2 : 
				//code
				break;
			case 3:
				//code
				//enter bid to issue
				//enter sid whom to issue
				
				service.issueBook(bid, sid);
				break;
			case 4 :
				//code
				//enter bid to return
				
				service.returnBook(bid);
				break;
			case 5:
				return;
			case 6: 
				//code
				break;
			case 7: 
				//code
				///ebter book title
				//enter author 
				//
//				service.addBook(title,author);
				break;
			}
		}
	}

}
