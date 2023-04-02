package com.rest.app.controller;

import com.rest.app.domain.Book;
import com.rest.app.repository.BookRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

// Shift + Command + T to generate test class
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBookRecords() {
        return bookRepository.findAll();
    }

    @GetMapping("{bookId}")
    public Book getBookById(@PathVariable("bookId") Long bookId) {
        return bookRepository.findById(bookId).get();
    }

    @PostMapping
    public Book createBookRecord(@RequestBody @Valid Book bookRecord) {
        return bookRepository.save(bookRecord);
    }

    @PutMapping
    public Book updateBookRecord(@RequestBody @Valid Book bookRecord) throws NotFoundException {
        if (bookRecord == null || bookRecord.getBookId() == null) {
            throw new NotFoundException("BookRecord or ID must not be null");
        }
        Optional<Book> optionalBook = bookRepository.findById(bookRecord.getBookId());
        if (!optionalBook.isPresent()) {
            throw new NotFoundException("Book with ID: " + bookRecord.getBookId() + " does not exist");
        }
        Book existingBookRecord = optionalBook.get();
        existingBookRecord.setName(bookRecord.getName());
        existingBookRecord.setSummary(bookRecord.getSummary());
        existingBookRecord.setRating(bookRecord.getRating());

        return bookRepository.save(existingBookRecord);
    }

    @DeleteMapping("{bookId}")
    public void deleteBookById(@PathVariable("bookId") Long bookId) throws NotFoundException {
        if (!bookRepository.findById(bookId).isPresent()) {
            throw new NotFoundException("bookId : " + bookId + " is not present");
        }

        bookRepository.deleteById(bookId);
    }
}
