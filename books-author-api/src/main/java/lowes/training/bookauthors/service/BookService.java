package lowes.training.bookauthors.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import lowes.training.bookauthors.model.Book;

@Service
public class BookService {

	private List<Book> books = new ArrayList<>(Arrays.asList(
			new Book("ABC123", "A Brief History Of Time", "Stephen Hawking"),
			new Book("PQR123", "Cosmos", "Carl Sagan"),
			new Book("XYZ123", "Hyperspace", "Michio Kaku")
			));
	
	public List<Book> getAllBooks() {
		return books;
	}
	
	public Book getBook(String isbn) {
		return books.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().get();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void updateBook(String isbn, Book book) {
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if (b.getIsbn().equals(isbn)) {
				books.set(i, book);
			}
		}
	}

	public void deleteBook(String isbn) {
		books.removeIf(b -> b.getIsbn().equals(isbn));
	}
}
