package com.mdc.CDI.books;

public class BookService {

    private NumberGenerator generator;


    public Book createBook(String title) {
        return new Book(title, generator.generateNumber());
    }
}
