package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository repository)
    {
        bookRepository = repository;
    }

    //Create Method
    public void save(Book book){
        bookRepository.save(book);
    }

    //Read Method
    public List<Book> findAll()
    {
        return bookRepository.findAll();
    }

    //Update Method
    public void put(Book book){
        Long id = book.getId();
        Book foundBook = bookRepository.getReferenceById(id);
        foundBook.setTitle(book.getTitle());
        foundBook.setAuthor(book.getAuthor());
        foundBook.setPages(book.getPages());
        bookRepository.save(foundBook);
    }

    //Delete Method
    public void delete (Long id)
    {
        bookRepository.deleteById(id);
    }


}
