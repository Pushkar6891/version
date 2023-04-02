package com.dailycodebuffer.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dailycodebuffer.model.Book;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getProducts(final Model model){

        List<Book> bookList = IntStream.range(0,7)
                        .mapToObj(this::getBook)
                        .collect(Collectors.toList());

        model.addAttribute("bookList",bookList);
        return "book";
    }

    private Book getBook(int i){
        return new Book((long) i,
                "ISBN Number -" + i,
                "Book Name " + i,
                "Author " + i,
                (double) (100 * i));
    }
}
