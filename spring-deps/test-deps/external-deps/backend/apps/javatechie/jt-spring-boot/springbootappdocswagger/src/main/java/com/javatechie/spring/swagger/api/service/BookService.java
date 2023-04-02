package com.javatechie.spring.swagger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.swagger.api.dao.BookRepository;
import com.javatechie.spring.swagger.api.model.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;

	public String saveBook(Book book) {
		repository.save(book);
		return "book saved with id " + book.getBookId();
	}

	public Book getBook(int bookId) {
		return repository.findById(bookId).get();
	}

	public List<Book> removeBook(int bookId) {
		repository.deleteById(bookId);
		return repository.findAll();
	}
}
