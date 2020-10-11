package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

//Implementation of the repository pattern- eric evans' book - Domain Driven Design book.
public interface AuthorRepository extends CrudRepository<Author, Long> {
}