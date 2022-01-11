package avaProject2;

public class Magazine extends Book {
	int month;
	
	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear,
			String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
	}






	@Override
	public String toString() {
		return super.toString() + "\t " + Integer.toString(month);
	}
}
