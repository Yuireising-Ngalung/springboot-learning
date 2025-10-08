package com.example.springLearning.service;

import com.example.springLearning.modal.BookModal;

import java.util.List;

public interface BookService {
    List<BookModal> findAllBooks();
    BookModal findBookById(int id);
    void deleteAllBooks();
}
