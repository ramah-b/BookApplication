package bookPackage;

//import java.util.Scanner;

import bookPackage.Book;

public class BookApp {
	
	public static void main(String[] args){
		
		Book myBook = new Book();
		
		/*
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Book ID: ");
		myBook.setBookID(keyboard.next());
		
		System.out.print("Author: ");
		myBook.setAuthor(keyboard.next());
		
		System.out.print("Title: ");
		myBook.setTitle(keyboard.next());
		
		System.out.print("Description: ");
		myBook.setDesription(keyboard.next());
		
		System.out.print("Price: ");
		myBook.setPrice(keyboard.nextDouble());
		
		keyboard.close();
		
		System.out.println("\n==================================\n");
		*/
		
		myBook.setBookID("CH101");
		myBook.setAuthor("Bill Waterson");
		myBook.setTitle("Calvin & Hobbes");
		myBook.setDesription("Calvin & Hobbes Collection");
		myBook.setPrice(14.99);
		
		System.out.println(myBook.getBookDetails());
		
	}

}
