package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Constructor injection
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor Injection called");
        this.bookRepository = bookRepository;
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection called");
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Book Title: " + bookRepository.getBookTitle());
    }
}
