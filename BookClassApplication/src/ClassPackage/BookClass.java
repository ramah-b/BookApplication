package ClassPackage;
import java.text.NumberFormat;


public class BookClass {

	private String bookTitle;
	private String bookAuthor;
	private String bookDesc;
	private double bookPrice;
	private boolean bookIsInStock;

	public BookClass(String title, String author, String desc, double price,
			boolean isInStock) {
		bookTitle = title;
		bookAuthor = author;
		bookDesc = desc;
		bookPrice = price;
		bookIsInStock = isInStock;
	}

	public void setBookTitle(String tempBookTitle) {
		bookTitle = tempBookTitle;
	}

	public String getBookTitle() {

		return bookTitle;
	}

	public void setBookAuthor(String tempBookAuthor) {
		bookAuthor = tempBookAuthor;
	}

	public void setBookDesc(String tempBookDesc) {
		bookDesc = tempBookDesc;
	}

	public void setBookPrice(double tempBookPrice) {
		bookPrice = tempBookPrice;
	}

	public void setBookIsInStock(boolean tempBookIsInStock) {
		bookIsInStock = tempBookIsInStock;
	}

	public String getBookAuthor() {

		return bookAuthor;
	}

	public String getBookDesc() {

		return bookDesc;
	}

	public double getBookPrice() {

		return bookPrice;
	}

	public boolean getBookIsInStock() {

		return bookIsInStock;
	}

	public double booksTotalPrice(int numOfBooks) {
		if (getBookIsInStock()) {
			double totalPrice;
			totalPrice = bookPrice * numOfBooks;
			return totalPrice;
		} else {
			return 0.0;

		}

	}

	public String getFormattedPrice(double totalPrice) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(totalPrice);
	}

	
}
