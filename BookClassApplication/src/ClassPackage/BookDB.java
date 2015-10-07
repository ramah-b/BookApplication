package ClassPackage;
import ClassPackage.BookClass;

public class BookDB {
	

	public static BookClass getCreatedBook(String bookTitle, String bookAuthor, String bookDesc, double bookPrice, boolean bookIsInStock){
		BookClass newBook = new BookClass();
		
		newBook.setBookTitle(bookTitle);
		newBook.setBookAuthor(bookAuthor);
		newBook.setBookDesc(bookDesc);
		newBook.setBookPrice(bookPrice);
		newBook.setBookIsInStock(bookIsInStock);
		
		return newBook;
	}
	
	
	

}
