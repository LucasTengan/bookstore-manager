package br.com.lucas.bookstoremanager.adapter.repository;

import br.com.lucas.bookstoremanager.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
