package lowes.training.simpleBook.model;

public class Book {

	private long ISBN;
	private String name;
	private String author;
	
	public Book(long iSBN, String name, String author) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.author = author;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
