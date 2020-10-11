package io.swagger.Repository;

import io.swagger.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    public List<Book> findByAuthor(String name);
    public boolean existsByTitle(String title);
    public List<Book> findByTitle(String title);
    Book findById(Long id);
}
