package br.com.lucas.bookstoremanager.adapter.controller.entity;

import br.com.lucas.bookstoremanager.domain.entity.Author;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
public class BookRequest {

    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private Integer pages;
    @Column(nullable = false)
    private Integer chapters;
    @Column(nullable = false)
    private String isbn;
    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publisherName;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    // Para fazer a consulta dos autores de um livro, ele precisa, antes, fazer uma consulta com um join para retornar o dado -> ganho de performance
    @JoinColumn(name = "author_id")
    private Author author;
}
