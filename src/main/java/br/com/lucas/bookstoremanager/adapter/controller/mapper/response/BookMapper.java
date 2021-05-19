package br.com.lucas.bookstoremanager.adapter.controller.mapper.response;

import br.com.lucas.bookstoremanager.adapter.controller.entity.BookRequest;
import br.com.lucas.bookstoremanager.adapter.controller.entity.BookResponse;
import br.com.lucas.bookstoremanager.domain.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class BookMapper {
    public static final BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    public abstract BookResponse toResponse(Book book);
    public abstract Book toEntity(BookRequest bookRequest);

}
