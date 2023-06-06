package com.example.java_web_final_project.controller;

import com.example.java_web_final_project.model.Book;
import com.example.java_web_final_project.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:63342")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService1)
    {
        bookService = bookService1;
    }

    @GetMapping
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @PostMapping
    public void saveBook(@RequestBody Book book){
        bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id)
    {
        bookService.delete(id);
    }

    @PutMapping
    public void putBook(@RequestBody Book book)
    {
        bookService.put(book);
    }

}
