package lowes.training.simpleBook.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lowes.training.simpleBook.model.Book;

@RestController
public class BookController {
	
	@RequestMapping("/books")
	List<Book> getBooks() {
		return Arrays.asList(new Book(1425678899, "A brief History of Time", "Stephen Hawkins"));
	}

}
