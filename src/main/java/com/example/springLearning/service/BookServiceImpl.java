package com.example.springLearning.service;

import com.example.springLearning.modal.BookModal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private List<BookModal> bookModals = new ArrayList<>();

    public BookServiceImpl(){
        bookModals.add(new BookModal(1, "HTML", "John Doe"));
        bookModals.add(new BookModal(2, "CSS", "Alice"));
        bookModals.add(new BookModal(3, "JavaScript", "Charlie"));
    }

    @Override
    public List<BookModal> findAllBooks() {
        return bookModals;
    }

    @Override
    public BookModal findBookById(int id) {
        return bookModals.stream()
                .filter(bookModal -> bookModal.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteAllBooks() {
        bookModals.clear();
    }
}
