package lowes.training.bookauthors.controller;

import lowes.training.bookauthors.model.Book;
import lowes.training.bookauthors.service.BookService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return bookservice.getAllBooks();
	}
	
	@RequestMapping("/books/{isbn}")
	public Book getBook(@PathVariable String isbn) {
		return bookservice.getBook(isbn);
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/books")
	public void addBook(@RequestBody Book book) {
		bookservice.addBook(book);
	}
	
	@RequestMapping(method=RequestMethod.PUT, path="/books/{isbn}")
	public void addBook(@RequestBody Book book, @PathVariable String isbn) {
		bookservice.updateBook(isbn, book);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path="/books/{isbn}")
	public void deleteBook(@PathVariable String isbn) {
		bookservice.deleteBook(isbn);
	}
	
}
