package br.com.lucas.bookstoremanager.adapter.controller;

import br.com.lucas.bookstoremanager.adapter.controller.entity.BookRequest;
import br.com.lucas.bookstoremanager.adapter.controller.entity.BookResponse;
import br.com.lucas.bookstoremanager.adapter.controller.mapper.response.BookMapper;
import br.com.lucas.bookstoremanager.application.service.BookService;
import br.com.lucas.bookstoremanager.domain.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    @PostMapping("/")
    public ResponseEntity<BookResponse> create(@RequestBody BookRequest bookRequest) {
        Book bookEntity = bookMapper.toEntity(bookRequest);
        Book createdBook = bookService.create(bookEntity);
        BookResponse bookResponse = bookMapper.toResponse(createdBook);

        return new ResponseEntity<>(bookResponse, HttpStatus.CREATED);
    }
}
