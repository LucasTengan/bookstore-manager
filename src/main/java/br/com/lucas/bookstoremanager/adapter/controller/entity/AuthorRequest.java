package br.com.lucas.bookstoremanager.adapter.controller.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AuthorRequest {

    @NotNull @Size(max = 200)
    private String name;
    @NotNull
    private Integer age;
}
