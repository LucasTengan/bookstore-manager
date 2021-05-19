package br.com.lucas.bookstoremanager.adapter.controller.entity;

import br.com.lucas.bookstoremanager.domain.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {

    private String name;
    private Integer pages;
    private Integer chapters;
    private Author author;
}
