package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    //Books findByTitleAndAuthor(String title, String author);
}
