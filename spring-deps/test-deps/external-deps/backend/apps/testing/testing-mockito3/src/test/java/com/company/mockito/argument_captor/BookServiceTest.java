package com.company.mockito.argument_captor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Captor
	private ArgumentCaptor<Book> bookArgumentCaptor;
	
	
	@Test
	public void testSaveBook() {
		BookRequest bookRequest = new BookRequest("Mockito In Action", 500, LocalDate.now());
		bookService.addBook(bookRequest);
		verify(bookRepository).save(bookArgumentCaptor.capture());
		Book book = bookArgumentCaptor.getValue();
		assertEquals("Mockito In Action", book.getTitle());
	}
}
