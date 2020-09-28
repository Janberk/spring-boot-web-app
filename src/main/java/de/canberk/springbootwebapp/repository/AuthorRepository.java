package de.canberk.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;

import de.canberk.springbootwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    
}
