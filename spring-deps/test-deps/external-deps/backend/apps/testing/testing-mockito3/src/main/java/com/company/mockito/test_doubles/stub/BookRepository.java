package com.company.mockito.test_doubles.stub;

import java.util.Collection;
import java.util.List;

public interface BookRepository {
	List<Book> findNewBooks(int days);
}
