package br.com.lucas.bookstoremanager.adapter.controller.entity;

import br.com.lucas.bookstoremanager.domain.entity.Author;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
public class BookRequest {

    @NotBlank
    @Size(max = 200)
    private String name;
    @NotNull
    private Integer pages;
    @NotNull
    private Integer chapters;
    @NotBlank @Size(max = 100)
    private String isbn;
    @NotBlank @Size(max = 200)
    private String publisherName;
    @NotNull @Valid
    private Author author;
}
