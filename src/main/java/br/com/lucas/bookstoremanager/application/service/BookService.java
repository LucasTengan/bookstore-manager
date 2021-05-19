package br.com.lucas.bookstoremanager.application.service;

import br.com.lucas.bookstoremanager.adapter.controller.entity.BookResponse;
import br.com.lucas.bookstoremanager.adapter.repository.BookRepository;
import br.com.lucas.bookstoremanager.domain.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book create(Book book) {
        Book savedBook = bookRepository.save(book);
        return savedBook;
    }
}
