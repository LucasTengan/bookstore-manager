package br.com.lucas.bookstoremanager.adapter.controller.mapper;

import br.com.lucas.bookstoremanager.adapter.controller.entity.BookRequest;
import br.com.lucas.bookstoremanager.adapter.controller.entity.BookResponse;
import br.com.lucas.bookstoremanager.domain.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookResponse toResponse(Book book);
    Book toEntity(BookRequest bookRequest);

}
