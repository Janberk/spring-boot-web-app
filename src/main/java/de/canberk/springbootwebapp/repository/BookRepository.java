package de.canberk.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;

import de.canberk.springbootwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {    
}
