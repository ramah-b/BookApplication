package ClassPackage;
import java.util.Scanner;

import ClassPackage.BookDB;

public class BookQuantProg {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String tempTitle, tempAuthor, tempDesc;
		double tempPrice, totalPrice;
		boolean tempIsInStock;
		int tempNumOfBooks;

		System.out.println("Enter the book details.");

		System.out.print("Book Title: ");
		tempTitle = keyboard.next();

		System.out.print("Book Author: ");
		tempAuthor = keyboard.next();

		System.out.print("Book Description: ");
		tempDesc = keyboard.next();
		keyboard.nextLine();

		System.out.print("Book Price: ");
		tempPrice = keyboard.nextDouble();

		System.out.print("Book in stock? ");
		tempIsInStock = keyboard.nextBoolean();
		
		

		BookClass book = BookDB.getCreatedBook(tempTitle, tempAuthor, tempDesc, tempPrice, tempIsInStock );

		System.out.println();

		System.out.print("How many books are required? ");
		tempNumOfBooks = keyboard.nextInt();

		totalPrice = book.booksTotalPrice(tempNumOfBooks);
		if (totalPrice != 0.0) {
			String formattedTotalPrice = book.getFormattedPrice(totalPrice);
			System.out.println("Total price is: " + formattedTotalPrice);
		} else
			System.out.println("Not enough books in the inventory. ");

		keyboard.close();
	}

}
