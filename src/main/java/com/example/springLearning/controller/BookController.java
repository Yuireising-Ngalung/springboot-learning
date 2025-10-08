package com.example.springLearning.controller;

import com.example.springLearning.modal.BookModal;
import com.example.springLearning.service.BookService;
import com.example.springLearning.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("books")
    public List<BookModal> getAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("books/{id}")
    public BookModal getBooKById(@PathVariable int id){
        return bookService.findBookById(id);
    }

    @DeleteMapping("/books/delete")
    public String deleteAllBooks(){
        bookService.deleteAllBooks();
        return "All books have been Deleted";
    }
}
