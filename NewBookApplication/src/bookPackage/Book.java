package bookPackage;

public class Book {

	private String bookID;
	private String author;
	private String title;
	private String description;
	private double price;

	public Book() {
		bookID = "";
		author = "";
		title = "";
		description = "";
		price = 0;
	}

	public Book(String bookID, String author, String title, String description, double price){
		this.bookID = bookID;
		this.author = author;
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesription() {
		return description;
	}

	public void setDesription(String desription) {
		this.description = desription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBookDetails(){
		return this.author + "\n" + this.title + "\n" + this.description;
	}
	
	

}
